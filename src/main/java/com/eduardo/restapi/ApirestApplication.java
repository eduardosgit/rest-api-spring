package com.eduardo.restapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduardo.restapi.domain.Categoria;
import com.eduardo.restapi.repositories.CategoriaRepository;

@SpringBootApplication
public class ApirestApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//mock para instanciar os objetos
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2= new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
