package org.javaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.javaweb.model.Cliente;

public class ClientesController {

	private ArrayList<Cliente> clientes;

	public ClientesController() {
		
	}
	
	public List<Cliente> getLista() {
		clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("João"));
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("José"));
		clientes.add(new Cliente("Ana"));
		return clientes;
	}
	
}
