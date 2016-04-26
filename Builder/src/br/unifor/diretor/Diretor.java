package br.unifor.diretor;

import br.unifor.cliente.Cliente;
import br.unifor.cliente.ClienteBuilder;

public class Diretor {
	
	private ClienteBuilder cliente;
	
	public void setClienteBuilder(ClienteBuilder cb){
		
		cliente=cb;
		
	}
	
	public Cliente getCliente(){
		return cliente.getCliente();
	}
	
	public void constructCliente(){
		
		cliente.createNewClienteBuilder();
		cliente.buildNome();
		cliente.buildEndereço();
		cliente.buildTelefone();
		cliente.buildEmail();
	}

}
