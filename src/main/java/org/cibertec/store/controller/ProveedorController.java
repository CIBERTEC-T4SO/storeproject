package org.cibertec.store.controller;

import org.cibertec.store.entity.ProveedorEntity;
import org.cibertec.store.service.CountryService;
import org.cibertec.store.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {


    @Autowired
    private ProveedorService proveedorService;

    @Autowired
    private CountryService paisService;


    @GetMapping("/mantenimiento")
    String paginaprincipal(Model model) {
        ProveedorEntity proveedor= new ProveedorEntity(); /*Creamos un objeto proveedor vacío para el formulario*/
        /*Preparando info para la Vista HTML*/
        model.addAttribute("lista",proveedorService.listarTodos());
        model.addAttribute("paises",paisService.listarTodos());
        model.addAttribute("proveedor",proveedor);


        return "proveedor/mantenimiento"; /*Aquí se muestra el HTML  */
    }

    @PostMapping("/guardar")
    public String guadar(@ModelAttribute ProveedorEntity proveedor
               /*   BindingResult result, Model model*/) {
        proveedorService.guardar(proveedor);
        return "redirect:/proveedor/mantenimiento"; /*Redirecciona a la página de mantenimiento*/
    }

    @GetMapping("/editar")
    String editar(@RequestParam("id") Integer   id,Model model) {
        ProveedorEntity proveedor= proveedorService.buscarPorId(id); /*Creamos un objeto proveedor vacío para el formulario*/


        /*Preparando info para la Vista HTML*/
        model.addAttribute("lista",proveedorService.listarTodos());
        model.addAttribute("paises",paisService.listarTodos());
        model.addAttribute("proveedor",proveedor);


        return "proveedor/mantenimiento"; /*Aquí se muestra el HTML  */
    }


    @GetMapping("/eliminar/{id}")
    String eliminar(@PathVariable Integer   id) {
         proveedorService.eliminar(id);
        return "redirect:/proveedor/mantenimiento";
    }


}
