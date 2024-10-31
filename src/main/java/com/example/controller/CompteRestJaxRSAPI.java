package com.example.controller;

import com.example.entity.Compte;
import com.example.repository.CompteRepository;
import jakarta.ws.rs.*;
import java.util.List;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/banque")

public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/compte")
    @GET
    @Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML} )
  public List<Compte> getComptes(){
        return compteRepository.findAll();
    }
    @Path("/compte/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML} )
    public Compte getCompte(@PathParam("id") Long id){
        return compteRepository.findById(id).orElse(null);
    }

    @Path("/compte")
    @PUT
    @Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML} )
    public Compte updateCompte(@PathParam("id") Long id , Compte compte){
        Compte existingCompte = compteRepository.findById(id).orElse(null);

        if(existingCompte !=null){
            existingCompte.setSolde(compte.getSolde());
            existingCompte.setDateCreation(compte.getDateCreation());
            existingCompte.setType(compte.getType());
            return compteRepository.save(existingCompte);
        }
        return null;
    }
    @Path("/compte/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML} )
    public void deleteCompte(@PathParam("id")Long id){
        compteRepository.deleteById(id);
    }


}

