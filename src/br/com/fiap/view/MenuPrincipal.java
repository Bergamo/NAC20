package br.com.fiap.view;

import java.io.IOException;

public class MenuPrincipal {

	public static void main(String[] args) {
		try {
			new MenuPrincipal().showMenuPrincipal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showMenuPrincipal() throws IOException {

		int swValue;

		System.out.println("=====================================");
		System.out.println("|        Selecione uma opcao        |");
		System.out.println("=====================================");
		System.out.println("| Options:                          |");
		System.out.println("|        1. Cadastrar Cliente       |");
		System.out.println("|        2. Cadastrar Produto       |");
		System.out.println("|        3. Sair                    |");
		System.out.println("=====================================");
		swValue = Keyin.inInt(" Selecione uma opcao : ");

		switch (swValue) {
		case 1:
			new CadastroCliente().showCadastro();
			this.limparTela();
			this.showMenuPrincipal();
			break;
		case 2:
			System.out.println("Option 2 selected");
			break;
		case 3:
			System.out.println("Exit selected");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
	}

	public void limparTela() {
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}
}
