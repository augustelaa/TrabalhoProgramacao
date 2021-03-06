package br.com.sistemajanela.dominio;

public abstract class Clicavel {

	private int x;
	private int y;
	private int altura;
	private int largura;
	private String id; 
	
	public Clicavel(int x, int y, int altura, int largura) {
		setX(x);
		setY(y);
		setAltura(altura);
		setLargura(largura);
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
        public String toString() {
            return id;
        }
}
