package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstadoController {
  
    
@Autowired
   private EstadoService estadoService;
       
     
         @GetMapping("/") 
    public String inicio(Model model){
        
        /*Lista de clientes*/    
        var estados=estadoService.getEstados(); 
        model.addAttribute("estados", estados);  
        return "index";
    }
    @GetMapping("/estado/eliminar/{idPais}")
    public String eliminaEstado(Estado estado){
        estadoService.deleteEstado(estado);
        return "redirect:/";
    }
    @GetMapping("/estado/nuevo") 
  
    public String nuevoestado(Estado estado){
        return "modificaEstado";
        
    }
    @PostMapping("/estado/guardar")
    public String guardarEstado(Estado estado){
        estadoService.saveEstado(estado);
        return "redirect:/";
    }
    @GetMapping("/estado/modificar/{idPais}") 
    public String modificaEstado(Estado estado, Model model){
        
        estado=estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificaEstado";
    }
}

