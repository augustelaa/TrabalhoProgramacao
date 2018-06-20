package test;

import org.junit.Test;

import br.com.sistemajanela.Icone;
import br.com.sistemajanela.Janela;
import br.com.sistemajanela.Regiao;

public class JanelaTest {

	@Test
	public void test() {
		Janela janela = new Janela();
		Icone icone = new Icone(5, 4);
		Regiao regiao = new Regiao(9, 10, 10, 10);
		janela.addItem(icone);
		janela.addItem(regiao);
		janela.clicar(5, 4);
		janela.clicar(5, 5);
		janela.clicar(9, 9);
		janela.clicar(9, 10);
		janela.clicar(12, 12);
	}

}
