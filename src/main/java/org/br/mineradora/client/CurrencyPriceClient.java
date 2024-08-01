package org.br.mineradora.client;

import org.br.mineradora.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

//@RegisterRestClient(baseUri = "https://economia.awesomeapi.com.br") 
@Path("/last")
@RegisterRestClient //Registra o serviço como um consumidor
@ApplicationScoped
public interface CurrencyPriceClient {
    
    @GET
    @Path("/{pair}")
    CurrencyPriceDTO getPriceByPair(@PathParam("pair") String pair);
}
