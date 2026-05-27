package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {

    // Buscar mascotas por su nombre exacto
    List<Pet> findByName(String name);

    // Buscar mascotas que le pertenezcan a un dueño específico
    List<Pet> findByOwnerId(Integer ownerId);

    // Buscar mascotas por su tipo (perro, gato, etc.)
    List<Pet> findByTypeId(Integer typeId);
}