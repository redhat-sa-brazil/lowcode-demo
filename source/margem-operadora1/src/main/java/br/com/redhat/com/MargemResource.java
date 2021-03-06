package br.com.redhat.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/margens")
public class MargemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)   
    @Path("/operadora/{operadora}/cpf/{cpf}")
    public Margem margemOperadoraUm(@PathParam("operadora") String operadora, @PathParam("cpf") Integer cpf){
        Margem margem = new Margem();
        margem.setName("Nome Cliente Operadora 1");
        margem.setCpf(1111);
        margem.setMargem(1111);
        margem.setOperadora("Nome Operadora 1");
        return margem;
    }
    
}
