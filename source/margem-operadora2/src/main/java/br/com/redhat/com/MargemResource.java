package br.com.redhat.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/margens2")
public class MargemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)   
    @Path("/operadora/{operadora}/cpf/{cpf}")
    public Margem margemOperadoraDois(@PathParam("operadora") String operadora, @PathParam("cpf") Integer cpf){
        Margem margem = new Margem();
        margem.setName("Name 2");
        margem.setCpf(2222);
        margem.setMargem(2222);
        margem.setOperadora("Nome Operadora 2");
        return margem;
    }
    
}
