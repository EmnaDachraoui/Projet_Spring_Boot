package com.nadhem.departements;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.nadhem.departements.entities.Departement;
import com.nadhem.departements.repos.DepartementRepository;
import com.nadhem.departements.service.DepartementService;

@SpringBootTest
class DepartementsApplicationTests {
	
@Autowired
private DepartementRepository departementRepository;

@Autowired
private DepartementService departementService;
@Test

public void testCreateDepartement() {
Departement dep = new Departement("TI","Departement de la technologie de l'Informatique");
departementRepository.save(dep);
}

@Test
public void testFindDepartement()
{
Departement d = departementRepository.findById(1L).get(); 
System.out.println(d);
}

@Test
public void testUpdateDepartement()
{
Departement d = departementRepository.findById(1L).get();
d.setNomDepartement("GC");
departementRepository.save(d);
}

@Test
public void testDeleteDepartement()
{
departementRepository.deleteById(1L);;
}
 
@Test
public void testListerTousDepartements()
{
List<Departement> deps = departementRepository.findAll();
for (Departement d : deps)
{
System.out.println(d);
}
}

@Test
public void testFindByNomDepartementContains()
{
Page<Departement> deps = departementService.getAllDepartementsParPage(0,2);
System.out.println(deps.getSize());
System.out.println(deps.getTotalElements());
System.out.println(deps.getTotalPages());
deps.getContent().forEach(p -> {System.out.println(p.toString());
 });
/*ou bien
for (Departement d : deps)
{
System.out.println(d);
} */
}
}
