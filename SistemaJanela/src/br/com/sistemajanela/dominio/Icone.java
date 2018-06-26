package br.com.sistemajanela.dominio;

import java.util.concurrent.atomic.AtomicInteger;

public class Icone extends Clicavel {
	
	public static int altura;
	public static int largura;
	
	private static final AtomicInteger sequencia = new AtomicInteger(0);

	public Icone(int x, int y) {
		super(x, y, altura, largura);
		setId(String.valueOf(sequencia.incrementAndGet()));
	}

}
