package br.com.cesta.mercados.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MercadoController {
	
	@GetMapping("/mercados")
	public List<Mercado> mercado(@RequestParam(value = "latitude") float latitude, @RequestParam(value = "longitude") float longitude) {
		List<Mercado> mercados = new ArrayList<>();
		mercados.add(new Mercado("nome", 4, 4));
		return mercados;
	}
}
