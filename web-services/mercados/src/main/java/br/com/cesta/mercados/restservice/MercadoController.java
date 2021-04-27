package br.com.cesta.mercados.restservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class MercadoController {
	
	@GetMapping("/mercados")
	public List<Mercado> mercado(@RequestParam(value = "latitude") String latitude, @RequestParam(value = "longitude") String longitude) throws IOException {
		List<Mercado> mercados = new ArrayList<>();
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		String url = String.format("https://maps.googleapis.com/maps/api/place/textsearch/json?query=Mercados&location=%s,%s2&radius=10000&key=AIzaSyDCWPOaRnQ4gew0H3Dr_PY8NDdmQXMBq7g", latitude, longitude);
		Request request = new Request.Builder()
				.url(url)
				.method("GET", null)
				.build();
		Response response = client.newCall(request).execute();

		String jsonData = response.body().string();
		JSONObject Jobject = new JSONObject(jsonData);
		JSONArray Jarray = Jobject.getJSONArray("results");

		for (int i = 0; i < Jarray.length(); i++) {
			JSONObject object     = Jarray.getJSONObject(i);
			
			// Calculando a distancia
			float userLat = Float.parseFloat(latitude);
			float userLng = Float.parseFloat(longitude);
			
			JSONObject geometry = object.getJSONObject("geometry");
	        JSONObject locat = geometry.getJSONObject("location");
					
			double latDistance = Math.toRadians(userLat - locat.getFloat("lat"));
		    double lngDistance = Math.toRadians(userLng - locat.getFloat("lng"));

		    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
		      + Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(locat.getFloat("lat")))
		      * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

		    double angle = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		    double distancia = Math.round(((6371 * angle)*100))/100;
				 
				 Mercado mercado = new Mercado(
					  object.getString("name"),
					  distancia,
					  object.getFloat("rating")
				 	);
				 	
				 mercados.add(mercado);
				}
				// Ordenando a lista por distancia
				mercados.sort(Comparator.comparingDouble(Mercado::getDistancia));
				return mercados;
	}
}
