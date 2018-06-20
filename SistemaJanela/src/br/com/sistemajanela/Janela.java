package br.com.sistemajanela;

import java.util.logging.Logger;

public class Janela {

	private Clicavel[][] mapa;
	private static final Logger logger = Logger.getLogger(Janela.class.getName());
	protected static int identificadores = 0;
	
	public Janela() {
		mapa = new Clicavel[500][500];
	}
	
	public void addItem(Clicavel item) {
		if (item == null)
			return;
		
		for (int i = 0; i < item.getAltura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				mapa[item.getX()+i][item.getY()+j] = item;
			}
		}
	}
	
	public void remItem(Clicavel item) {
		if (item == null) 
			return;

		for (int i = 0; i < item.getAltura(); i++) {
			for (int j = 0; j < item.getAltura(); j++) {
				mapa[item.getX()+i][item.getY()+j] = null;
			}
		}
	}
	
	/**
	 * TODO: Implementar função baseada na equação matemática
	 * @param x
	 * @param y
	 * @return
	 */
	private Clicavel buscarIconeProximo(int x, int y) {
		Clicavel item = null;
//		for (int i = 0; i < mapa.length; i++) {
//			for (int j = 0; j < mapa[x].length; j++) {
//				
//			}
//		}
		return item;
	}
	
	private Clicavel analisarCoordenada(int x, int y) {
		Clicavel item = null;
		if (mapa[x][y] != null) {
			item = mapa[x][y];
		}
		return item;
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
			logger.info("Clicavel: " + item.getId());
		} else {
			logger.info("Nenhum item foi selecionado, realizando busca dos icones nas proximidades...");
			item = buscarIconeProximo(x, y);
			if (item != null) {
				logger.info("Icone: " + item.getId());
			} else {
				logger.info("Não existe nenhum icone próximo.");
			}
		}
	}
}
