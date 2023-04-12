package com.nadhem.departements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.departements.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
