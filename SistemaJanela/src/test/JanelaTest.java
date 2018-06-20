package test;

import org.junit.Test;

import br.com.sistemajanela.Icone;
import br.com.sistemajanela.Janela;
import br.com.sistemajanela.Regiao;

public class JanelaTest {

	@Test
	public void test() {
		Janela janela = new Janela();
		Icone icone1 = new Icone(5, 4);
		Icone icone2 = new Icone(33, 33);
		Icone icone3 = new Icone(25, 25);
		Regiao regiao4 = new Regiao(9, 10, 10, 10);
		janela.addItem(icone1);
		janela.addItem(icone2);
		janela.addItem(icone3);
		janela.addItem(regiao4);
		janela.clicar(5, 4);
		janela.clicar(5, 5);
		janela.clicar(9, 9);
		janela.clicar(29, 29);
		janela.clicar(9, 10);
		janela.clicar(12, 12);
	}

}
