package com.nadhem.departements.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nadhem.departements.entities.Departement;

public interface DepartementService {
	Departement saveDepartement(Departement d);
	Departement updateDepartement(Departement d);
void deleteDepartement(Departement d);
 void deleteDepartementById(Long id);
 Departement getDepartement(Long id);
List<Departement> getAllDepartements();

Page<Departement> getAllDepartementsParPage(int page, int size);

}

