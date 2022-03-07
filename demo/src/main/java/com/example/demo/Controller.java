package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")  // Es la url que va estar disponible

public class Controller {
    public Controller() {
    }

    @GetMapping  //Existe dos get (get one que es con id - get list )
    public String list(){
       return "Este es el método para consultar todos los productos";
    }

    @PostMapping
    public String create(){
        return "Este es el método para crear un producto";
    }

    @PutMapping
    public String update(){
        return "Este es el método para actualizar un producto";
    }

    @DeleteMapping
    public String delete(){
        return "Este es el método para eliminar un producto";
    }



}
