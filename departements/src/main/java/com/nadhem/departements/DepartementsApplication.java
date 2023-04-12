package com.nadhem.departements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadhem.departements.entities.Departement;
import com.nadhem.departements.service.DepartementService;

@SpringBootApplication
public class DepartementsApplication implements CommandLineRunner {
	
@Autowired

DepartementService departementService;
public static void main(String[] args) {
SpringApplication.run(DepartementsApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
	departementService.saveDepartement(new Departement("TI", "TECHNOLOGIE DE L'INFORMATIQUE"));
	departementService.saveDepartement(new Departement("GC", "GENIE CIVIL"));
	departementService.saveDepartement(new Departement("GE", "GENIE ELECTRIQUE"));
}}


