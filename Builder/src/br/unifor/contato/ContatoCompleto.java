package br.unifor.contato;

import br.unifor.cliente.ClienteBuilder;

public class ContatoCompleto extends ClienteBuilder {
	
	public void buildNome() {
		cliente.setNome("Joao");
		
	}


	public void buildEndereço() {
		cliente.setEndereco("rua legal 300 ap 222");
		
	}

	public void buildTelefone() {
		cliente.setTelefone("995959595");
		
	}


	public void buildEmail() {
		cliente.setEmail("joaopaulo@unifor.br");
		
	}

}
