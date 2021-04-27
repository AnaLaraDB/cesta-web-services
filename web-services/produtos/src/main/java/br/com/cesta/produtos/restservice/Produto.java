package br.com.cesta.produtos.restservice;

public class Produto {
	private final String nome;
	private final double preco;
	private final String mercado;
	private final double distancia;

	public Produto(String nome, double preco, String mercado, double distancia) {
		this.nome = nome;
		this.preco = preco;
		this.mercado = mercado;
		this.distancia = distancia;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getMercado() {
		return mercado;
	}

	public double getDistancia() {
		return distancia;
	}
}

