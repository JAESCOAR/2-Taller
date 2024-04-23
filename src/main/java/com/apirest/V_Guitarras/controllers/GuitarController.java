package com.apirest.V_Guitarras.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.apirest.V_Guitarras.models.Guitar;
import com.apirest.V_Guitarras.repository.GuitarRepository; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("api/Guitar") 

public class GuitarController {
    
    @Autowired
    private GuitarRepository guitarRepository; 

    // Obtener todas las guitarras
    @GetMapping()
    public List<Guitar> getAll(){
        return guitarRepository.findAll();
    }
    
    // Obtener por una ID
    @GetMapping("/{id}")
    public Guitar getById(@PathVariable("id") Long id){
        return guitarRepository.findById(id).orElse(null);
    }
    
    // Crear una guitarra
    @PostMapping()
    public Guitar createGuitar(@RequestBody Guitar guitar){ // Cambio en el nombre del método
        return guitarRepository.save(guitar);
    }
    
    // Actualizar guitarras
    @PutMapping("/{id}")
    public Guitar updateGuitar(@PathVariable("id") Long id, @RequestBody Guitar guitar) {
        guitar.setId(id);
        return guitarRepository.save(guitar);
    }
    
    // Borrar guitarras
    @DeleteMapping("/{id}")
    public void deleteGuitar(@PathVariable("id") Long id){
        guitarRepository.deleteById(id);
    }
}
