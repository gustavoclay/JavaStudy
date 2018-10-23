package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.data.Chamado;
import com.example.data.Status;

@Path("chamados")
public class ChamadoController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public List<Chamado> listChamados() {
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

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}/")
	public Chamado getChamados(@PathParam("id") long id) {
		Chamado c1 = new Chamado();
		c1.setId(id);
		c1.setAssunto("aplicacao " + id);
		c1.setMensagem("CID fora do ar, verificar " + id);
		c1.setStatus(Status.DESIGNADO);

		return c1;
	};

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(Chamado chamado) {
		System.out.println(chamado.toString());
		return Response.status(Response.Status.OK).build();
	};

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(Chamado chamado) {
		System.out.println(chamado.toString());
		return Response.status(Response.Status.OK).build();
	};

	@DELETE
	@Path("{id}/")
	public Response delete(@PathParam("id") long id) {
		System.out.println("Deletando id: " + id);
		return Response.status(Response.Status.OK).build();
	};

}
