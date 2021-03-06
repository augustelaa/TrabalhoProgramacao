package br.com.sistemajanela.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

public class Janela {

	private Clicavel[][] mapa;
	private List<Clicavel> itens;
	
	public Janela() {
		mapa = new Clicavel[500][500];
		itens = new ArrayList<Clicavel>();
	}
	
	public void addItem(Clicavel item) {
		if (item == null) {
			throw new IllegalArgumentException("O clicavel não pode ser nulo.");
		}

		itens.add(item);
		
		for (int i = 0; i < item.getLargura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				// Consideramos regiões com mais peso do que icones 
				if ((item.getClass()  == Icone.class) 
						&& (mapa[item.getX()+i][item.getY()+j] != null) 
						&& (mapa[item.getX()+i][item.getY()+j]).getClass() == Regiao.class) {
					continue;
				}
				mapa[item.getX()+i][item.getY()+j] = item;
			}
		}
	}
	
	public void remItem(Clicavel item) {
		if (item == null) { 
			throw new IllegalArgumentException("O clicavel não pode ser nulo.");
		}

		if (item.getClass() == Icone.class) {
			itens.remove(item);
		}
		
		for (int i = 0; i < item.getLargura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				mapa[item.getX()+i][item.getY()+j] = null;
			}
		}
	}
	
	public double getDistancia(int xInicial, int yInicial, int xFinal, int yFinal) {
		return Math.hypot(xInicial - xFinal, yInicial - yFinal);
	}

	private Clicavel buscarIconeProximo(int x, int y) {
		
		if (itens.isEmpty()) {
			return null;
		}
		
		double distancia = 0f;
		Clicavel retorno = null;
		double menorDistancia = 0;

		for (Clicavel item : itens) {
			if (item.getClass() != Icone.class) {
				continue;
			}
			// Percorremos todas as distancias considerando as dimens�es
			for (int i = 0; i < Icone.LARGURA; i++) {
				for (int j = 0; j < Icone.ALTURA; j++) {
					distancia = getDistancia(item.getX() + i, item.getY() + j, x, y);
					if (menorDistancia > distancia || retorno == null) {
						menorDistancia = distancia;
						retorno = item;
					}
				}
			}
		}
		return retorno;
	}
	
	private Clicavel analisarCoordenada(int x, int y) {
		if ( (x < 0 || x > 499) || (y < 0 || y > 499) ) {
			throw new IllegalArgumentException("As coordenadas devem estar entre 0...499.");
		}
		
		Clicavel retorno = null;
		if (mapa[x][y] != null) {
			retorno = mapa[x][y];
		}
		return retorno;
	}

	public Clicavel clicar(int x, int y, JTextArea area) {
		
		if (area == null) {
			return null;
		}
		
		area.setText("");
		
		Clicavel item = null;
		area.append("Realizando um click nas coordenadas: (" + x + "," + y + ").\n");
		item = analisarCoordenada(x, y);
		if (item != null) {
			area.append("Clicavel: nas coordenadas: (" + item.getX() + "," + item.getY() + ").\n");
		} else {
			area.append("Nenhum item foi selecionado, realizando busca dos icones nas proximidades...\n");
			item = buscarIconeProximo(x, y);
			if (item != null) {
				area.append("Icone nas coordenadas: (" + item.getX() + "," + item.getY() + ").\n");
			} else {
				area.append("Não existe nenhum icone próximo.");
			}
		}
		return item;
	}
}
