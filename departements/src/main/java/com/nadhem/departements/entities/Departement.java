package com.nadhem.departements.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idDepartement;
private String nomDepartement;
private String description;

public Departement() {
super();
}
public Departement(String nomDepartement, String description) {
super();
this.nomDepartement = nomDepartement;
this.description = description;
}
public Long getIdDepartement() {
return idDepartement;
}
public void setIdDepartement(Long idDepartement) {
this.idDepartement = idDepartement;
}
public String getNomDepartement() {
return nomDepartement;
}
public void setNomDepartement(String nomDepartement) {
this.nomDepartement = nomDepartement;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}

@Override
public String toString() {
return "Produit [IdDepartement=" + idDepartement + ", nomDepartement=" + 
		nomDepartement + ", Description=" + description ;
}
}
