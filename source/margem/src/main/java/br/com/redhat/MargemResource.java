package br.com.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/margem")
public class MargemResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)   
    @Path("/operadora1/{cpf}")
    public String margemOperadoraUm(@PathParam("cpf") Integer cpf){
        StringBuffer jsonBuffer = new StringBuffer();
        jsonBuffer.append("{");
        jsonBuffer.append("\"cpf\": ");
        jsonBuffer.append(cpf);
        jsonBuffer.append(", ");
        jsonBuffer.append("\"operadora\": ");
        jsonBuffer.append("\"operadora1\"");
        jsonBuffer.append("}");
        return jsonBuffer.toString();
    }
    
}
