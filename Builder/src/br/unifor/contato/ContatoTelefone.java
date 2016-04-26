package br.unifor.contato;

import br.unifor.cliente.ClienteBuilder;

public class ContatoTelefone extends ClienteBuilder{
	
	public void buildNome() {
		cliente.setNome("Joao");
		
	}


	public void buildEndereço() {
		cliente.setEndereco(null);
		
	}

	public void buildTelefone() {
		cliente.setTelefone("995959595");
		
	}


	public void buildEmail() {
		cliente.setEmail(null);
		
	}

}
