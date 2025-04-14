package com.demo.petadoption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.petadoption.model.Pet;
import com.demo.petadoption.repository.PetRepository;

@RestController
public class PetController 
{

    @Autowired
    private PetRepository petRepo;

    @PostMapping("/insert")
    public Pet insertPet(@RequestBody Pet p) 
    {
    	return petRepo.save(p);
    }
    
    @PostMapping("/update")
	public Pet updatePet(@RequestBody Pet p)
	{
		return petRepo.save(p);
	}

    @PostMapping("/delete")
	public String deletePet()
	{
		petRepo.deleteAll();
		return "Pet Data Deleted Successfully";
	}
	
    @GetMapping("/view")
    public List<Pet> view() {
        return petRepo.findAll();
    }
    
}
