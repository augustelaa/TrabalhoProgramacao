package br.com.sistemajanela;

public abstract class Clicavel {

	private int x;
	private int y;
	private int altura;
	private int largura;
	private int id;
	
	/**
	 * TODO: Implementar controle dos identificadores de forma mais elegante
	 * @param x
	 * @param y
	 * @param altura
	 * @param largura
	 */
	public Clicavel(int x, int y, int altura, int largura) {
		setX(x);
		setY(y);
		setAltura(altura);
		setLargura(largura);
		Janela.identificadores++;
		setId(Janela.identificadores);
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
