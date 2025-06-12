package org.cibertec.store.controller;

import org.cibertec.store.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;


    @GetMapping("/hello/{id}")
    String asdasdasdsadasdasdsadasdsadasdasdsa(@PathVariable Integer id) {
        System.out.println("ID recibido: " + id);
        return "hola";
    }
}
