package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;

import java.util.List;

public interface PetService {

    // Buscar una mascota por su ID (puede lanzar excepción si no existe)
    Pet findById(long id) throws PetNotFoundException;

    // Buscar mascotas por su nombre
    List<Pet> findByName(String name);

    // Buscar mascotas por su tipo (perro, gato, etc.)
    List<Pet> findByTypeId(Integer typeId);

    // Buscar mascotas por el ID de su dueño
    List<Pet> findByOwnerId(Integer ownerId);

    // Registrar una nueva mascota
    Pet create(Pet pet);

    // Actualizar los datos de una mascota existente
    Pet update(Pet pet);

    // Eliminar una mascota por su ID
    void delete(long id) throws PetNotFoundException;
}