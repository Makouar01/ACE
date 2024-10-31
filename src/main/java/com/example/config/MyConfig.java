package com.example.config;

import com.example.controller.CompteRestJaxRSAPI;
import com.example.repository.CompteRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;

public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }
}
