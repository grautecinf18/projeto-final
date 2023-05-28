package com.grautec.projetofinal.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.grautec.projetofinal.entities.Cliente;
import com.grautec.projetofinal.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	ClienteService service;
	
	@PostMapping
	public ResponseEntity<Cliente> cadastroCliente(@RequestBody Cliente obj){
		Cliente c = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(c.getId_cliente()).toUri();
		return ResponseEntity.created(uri).body(c);
	}
	
	@PostMapping(value = "/login/{email}/{senha}")
	public ResponseEntity<Cliente> loginCliente(@PathVariable String email, @PathVariable String senha){
		Cliente obj = service.login(email, senha);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
