package org.example.examenspringboot.controllers;


import org.example.examenspringboot.model.entities.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

@GetMapping
    public List<Producto> findAll() {
    List<Producto> productos = (List<Producto>) this.findAll();
    return findAll();
}

@GetMapping
    public List<Producto> findByPrecioGreaterThan(int precio) {
    List<Producto> productos = (List<Producto>) this.findByPrecioGreaterThan(precio);
    return findByPrecioGreaterThan(precio);
}
}
