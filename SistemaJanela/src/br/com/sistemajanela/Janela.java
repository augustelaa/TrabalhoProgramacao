package br.com.sistemajanela;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Janela {

	private Clicavel[][] mapa;
	private List<Clicavel> itens;
	
	private static final Logger logger = Logger.getLogger(Janela.class.getName());
	
	public Janela() {
		mapa = new Clicavel[500][500];
		itens = new ArrayList<Clicavel>();
	}
	
	public void addItem(Clicavel item) {
		if (item == null)
			return;
		
		itens.add(item);
		
		for (int i = 0; i < item.getAltura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				mapa[item.getX()+i][item.getY()+j] = item;
			}
		}
	}
	
	public void remItem(Clicavel item) {
		if (item == null) 
			return;

		itens.remove(item);
		
		for (int i = 0; i < item.getAltura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				mapa[item.getX()+i][item.getY()+j] = null;
			}
		}
	}

	private Clicavel buscarIconeProximo(int x, int y) {
		Clicavel retorno = null;
		double distancia = 0f;
		double menorDistancia = 0f;

		for (Clicavel item : itens) {
			// Consistencia para só comparar com icones
			if (item.getClass() == Icone.class) {
				// Percorremos todas as distancias considerando as dimensões
				for (int i = 0; i < Icone.altura; i++) {
					for (int j = 0; j < Icone.largura; j++) {
						distancia = Math.hypot((item.getX() + i) - x, (item.getY() + j) - y);
						// Se for o primeiro laço ou se a distancia for menor que a menor já registrada (não há problema em ser zero, pois se for iremos detectar na chamada da analisarCoordenada)
						if (menorDistancia > distancia || distancia == 0) {
							menorDistancia = distancia;
							retorno = item;
							break;
						}
					}
				}
			}
		}
		return retorno;
	}
	
	private Clicavel analisarCoordenada(int x, int y) {
		Clicavel retorno = null;
		if (mapa[x][y] != null) {
			retorno = mapa[x][y];
		}
		return retorno;
	}
	
	/**
	 * TODO: Implementar controle de relatório
	 * @param x
	 * @param y
	 */
	public void clicar(int x, int y) {
		logger.info("Realizando um click nas coordenadas: (" + x + "," + y + ").");
		Clicavel item = analisarCoordenada(x, y);
		if (item != null) {
			logger.info("Clicavel: nas coordenadas: (" + item.getX() + "," + item.getY() + ").");
		} else {
			logger.info("Nenhum item foi selecionado, realizando busca dos icones nas proximidades...");
			item = buscarIconeProximo(x, y);
			if (item != null) {
				logger.info("Icone nas coordenadas: (" + item.getX() + "," + item.getY() + ").");
			} else {
				logger.info("Não existe nenhum icone próximo.");
			}
		}
	}
}
