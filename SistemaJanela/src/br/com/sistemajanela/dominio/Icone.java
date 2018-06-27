package br.com.sistemajanela.dominio;

import java.util.concurrent.atomic.AtomicInteger;

public class Icone extends Clicavel {
	
	public static int ALTURA;
	public static int LARGURA;
	
	private static final AtomicInteger sequencia = new AtomicInteger(0);

	public Icone(int x, int y) {
		super(x, y, ALTURA, LARGURA);
		setId(String.valueOf(sequencia.incrementAndGet()));
	}

}
