package com.example.controllers;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.data.Chamado;
import com.example.data.Status;

@Path("chamados")
public class ChamadoController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Chamado> listChamados(){
		Chamado c1 = new Chamado();
		c1.setAssunto("1 aplicacao");
		c1.setMensagem("1 CID fora do ar, verificar");
		c1.setStatus(Status.DESIGNADO);
		
		Chamado c2 = new Chamado();
		c2.setAssunto("2 infraestrutura");
		c2.setMensagem("2 REDE fora do ar, verificar");
		c2.setStatus(Status.DESIGNADO);
		
		Chamado c3 = new Chamado();
		c3.setAssunto("3 microinfomatica");
		c3.setMensagem("3 instalar office, verificar");
		c3.setStatus(Status.RESOLVIDO);
		
		List<Chamado> chamados = new ArrayList<>();
		chamados.add(c1);
		chamados.add(c2);
		chamados.add(c3);
		
		return chamados;
	};
	
	
	getChamados();
	create();
	update();
	delet();
}
