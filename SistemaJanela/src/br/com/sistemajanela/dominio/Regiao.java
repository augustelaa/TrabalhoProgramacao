package br.com.sistemajanela.dominio;

public class Regiao extends Clicavel {

	// Inicia no 65 devido à ASCII
	private static int sequencia = 65;
	
	public Regiao(int x, int y, int altura, int largura) {
		super(x, y, altura, largura);
		setId(String.valueOf((char) sequencia));
		sequencia++;
	}
}
