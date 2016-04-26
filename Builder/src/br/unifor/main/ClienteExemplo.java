package br.unifor.main;

import br.unifor.cliente.Cliente;
import br.unifor.cliente.ClienteBuilder;
import br.unifor.contato.ContatoCompleto;
import br.unifor.contato.ContatoInternet;
import br.unifor.contato.ContatoTelefone;
import br.unifor.diretor.Diretor;

public class ClienteExemplo {

	public static void main(String[] args) {
		Diretor diretor= new Diretor();
		
		ClienteBuilder contatoCompleto = new ContatoCompleto();
		ClienteBuilder contatoInternet = new ContatoInternet();
		ClienteBuilder contatoTelefone = new ContatoTelefone();
		
		diretor.setClienteBuilder(contatoCompleto);
		diretor.constructCliente();
		
		Cliente cliente = diretor.getCliente();

	}

}
