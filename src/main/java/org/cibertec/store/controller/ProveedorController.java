package org.cibertec.store.controller;

import org.cibertec.store.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Tenemos que indicar que es un controlador de Spring MVC
@Controller
// Indicamos la ruta base del controlador, en este caso será /proveedor
@RequestMapping("/proveedor")
public class ProveedorController {


    // Inyectamos/instanciamos el servicio ProveedorService para poder acceder a los métodos de negocio
    @Autowired
    private ProveedorService proveedorService;

    // Metodo para manejar la petición GET a la ruta /proveedor/hello
    @GetMapping("hello")
    String verMantenimiento() {
        return "hola";
        }
}
