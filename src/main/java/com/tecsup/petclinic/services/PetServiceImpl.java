package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;
import com.tecsup.petclinic.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet findById(long id) throws PetNotFoundException {
        return petRepository.findById(id)
                .orElseThrow(() -> new PetNotFoundException("Pet not found with id: " + id));
    }

    @Override
    public List<Pet> findByName(String name) {
        return petRepository.findByName(name);
    }

    @Override
    public List<Pet> findByTypeId(Integer typeId) {
        return petRepository.findByTypeId(typeId);
    }

    @Override
    public List<Pet> findByOwnerId(Integer ownerId) {
        return petRepository.findByOwnerId(ownerId);
    }

    @Override
    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet update(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(long id) throws PetNotFoundException {
        Pet pet = findById(id);
        petRepository.delete(pet);
    }
}