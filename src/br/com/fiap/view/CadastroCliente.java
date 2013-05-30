package br.com.fiap.view;

import java.net.UnknownHostException;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.cliente.SocketCliente;

public class CadastroCliente {

	public void showCadastro() {

		String valida;

		Cliente cliente = new Cliente();
		cliente.setNome(Keyin.inString("Nome:"));
		cliente.setCpf(Keyin.inString("Cpf:"));

		do {
			valida = Keyin.inString("Deseja Salvar S/N :");

		} while (!valida.toUpperCase().equals("S")
				&& !valida.toUpperCase().equals("N"));
		
		if(valida.toUpperCase().equals("S")){
			cadastrarCliente(cliente);
		}
	}

	public void cadastrarCliente(Cliente cliente) {
		
		try {
			new SocketCliente().iniciaCliente(cliente);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(cliente.toString() + " Cadastrado com Sucesso!");
	}
}
