package com.demo.petadoption.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.petadoption.model.Pet;

public interface PetRepository extends JpaRepository<Pet, String> 
{

}