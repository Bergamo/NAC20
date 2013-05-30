package br.com.fiap.model.cliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import br.com.fiap.model.Cliente;

public class SocketCliente {

	public void iniciaCliente(Cliente cliente) throws UnknownHostException {
		try {

			Socket client = new Socket("127.0.0.1", 12345);
			ObjectOutputStream output = new ObjectOutputStream(client.getOutputStream());
			output.flush();

			output.writeObject(cliente);
			output.flush();
			output.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
