package org.cibertec.store.controller;

import org.cibertec.store.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proveedor")

public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/hello")
    String hola() {
        return "hola";
    }

}
