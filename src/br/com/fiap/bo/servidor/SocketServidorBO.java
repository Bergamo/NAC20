package br.com.fiap.bo.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


import br.com.fiap.model.Cliente;

public class SocketServidorBO {
	
	public static void main(String[] args) throws IOException {  
	      
	    @SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(12345);  
	    
	    @SuppressWarnings("resource")
		Socket socket = new Socket();  
	    SocketServidorBO servidor = new SocketServidorBO();  
	    
	    while(true){  
	          
		    try{  
		    	
		        System.out.println("Aguardando requisição...");  
		        socket = serverSocket.accept();  
		        
			    ObjectOutputStream out =  new ObjectOutputStream(socket.getOutputStream());
			    ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
		          
		        out.writeUTF("Status: Conectado");  
		        out.writeUTF("Hostname: " + socket.getLocalAddress());  
		        out.writeUTF("Sistema Operacional: " + System.getProperty("os.name"));  
		          
	            servidor.receberCliente(socket, in, out);  
		        
	        } catch(Exception e){  
	        }  
	    }  
	}
	
	public void receberCliente(Socket socket, ObjectInputStream in, ObjectOutputStream out) throws ClassNotFoundException{  
	    try {  
	          
	        Cliente clienteObj  = (Cliente)in.readObject();  	          
	        out.writeUTF("Executando comando enviado...");  	          	     	          
	        String saida = clienteObj.toString();  
	        
	        System.out.println(saida);  
	          
	    } catch (IOException e) {  
	    }  
	}  
}
