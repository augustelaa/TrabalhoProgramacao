package br.com.sistemajanela.dominio;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Clicavel {

	private int x;
	private int y;
	private int altura;
	private int largura;
	private int id;
	
	private static final AtomicInteger sequencia = new AtomicInteger(0); 
	
	public Clicavel(int x, int y, int altura, int largura) {
		setX(x);
		setY(y);
		setAltura(altura);
		setLargura(largura);
		setId(sequencia.incrementAndGet());
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x < 0 || x > 499)
			throw new IllegalArgumentException("A coordenada X deve estar entre 0...499.");

		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (y < 0 || y > 499)
			throw new IllegalArgumentException("A coordenada Y deve estar entre 0...499.");

		this.y = y;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if (altura <= 0)
			throw new IllegalArgumentException("A altura deve ser maior que zero.");

		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		if (largura <= 0)
			throw new IllegalArgumentException("A largura deve ser maior que zero.");

		this.largura = largura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
