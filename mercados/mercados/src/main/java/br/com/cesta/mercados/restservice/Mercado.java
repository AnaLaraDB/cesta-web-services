package br.com.cesta.mercados.restservice;

public class Mercado {
	private final String nome;
	private final float distancia ;
	private final float avaliacao;

	public Mercado(String nome, float distancia, float avaliacao) {
		this.nome = nome;
		this.distancia = distancia;
		this.avaliacao = avaliacao;
	}

	public String getNome() {
		return nome;
	}

	public float getDistancia() {
		return distancia;
	}
	
	public float getAvaliacao() {
		return avaliacao;
	}
}
