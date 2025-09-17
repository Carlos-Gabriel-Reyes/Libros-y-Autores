package com.carlosreyes.libros_y_autores.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ControladorLibros {
    private static HashMap<String, String> listaLibros = new HashMap<String, String>();

    public ControladorLibros() {
	listaLibros.put("Odisea", "Homero");	
	listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
	listaLibros.put("El Código Da Vinci", "Dan Brown");		
	listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
	listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
	listaLibros.put("El alquimista", "Paulo Coelho");	
    }

    @GetMapping("/libros")
    public String obtenerTodosLosLibros(Model model) {
        model.addAttribute("libros", listaLibros);
        return "libros";
    }
    @GetMapping("/libros/{nombreLibro}")
    public String obtenerLibroPorNombre(@PathVariable String nombreLibro, Model model) {
        String autor = listaLibros.get(nombreLibro);
        model.addAttribute("nombre", nombreLibro);
        model.addAttribute("autor", autor);
        return "detalleLibro";
    }
    @GetMapping("/formularioLibros")
    public String mostrarFormulario() {
        return "formularioLibros";
    }

    @PostMapping("/procesarLibros")
    public String agregarLibro(@RequestParam String nombre, @RequestParam String autor) {
        listaLibros.put(nombre, autor);
        return "redirect:/libros";
    }

    @GetMapping("/libros/autor/{nombreLibro}")
    public String obtenerAutorPorNombre(@PathVariable String nombreLibro, Model model) {
        String autor = listaLibros.get(nombreLibro);
        model.addAttribute("autor", autor);
        return "detalleLibro";
    }


}
