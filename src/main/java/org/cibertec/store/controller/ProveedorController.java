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

    /**
     * Endpoint para verificar el estado del mantenimiento.
     * @return Un mensaje de saludo.
     */
    @GetMapping("/hello")
    String  verMantenimiento() {
        return "hola";
    }
}
