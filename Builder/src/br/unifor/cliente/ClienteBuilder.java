package br.unifor.cliente;

public abstract class ClienteBuilder {

	protected Cliente cliente;
	
	public void createNewClienteBuilder(){
		cliente = new Cliente();
	}
	
	public abstract void buildNome();
	
	public abstract void buildEndereço();
	
	public abstract void buildTelefone();
	
	public abstract void buildEmail();
	
	
	public Cliente getCliente(){
		return 	cliente;
	}
}
