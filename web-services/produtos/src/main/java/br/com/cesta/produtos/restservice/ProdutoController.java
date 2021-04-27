package br.com.cesta.produtos.restservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProdutoController {
	@GetMapping("/produtos")
	public List<Produto> produto(
			@RequestParam(value = "latitude") String latitude, 
			@RequestParam(value = "longitude") String longitude,
			@RequestParam(value = "produto") String produto_nome) throws IOException {
		List<Produto> produtos = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			Produto produto = new Produto(
					  produto_nome,
					  10.59,
					  "Mercadinho Javiu",
					  0.0
				 	);
				 	
				 produtos.add(produto);
		}
		produtos.sort(Comparator.comparingDouble(Produto::getPreco));
		return produtos;
		}
}
