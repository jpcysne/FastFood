package br.unifor.contato;

import br.unifor.cliente.ClienteBuilder;

public class ContatoInternet extends ClienteBuilder  {


	public void buildNome() {
		cliente.setNome("Joao");
		
	}


	public void buildEndereço() {
		cliente.setEndereco(null);
		
	}

	public void buildTelefone() {
		cliente.setTelefone(null);
		
	}


	public void buildEmail() {
		cliente.setEmail("joaopaulo@unifor.br");
		
	}
	
	

}
