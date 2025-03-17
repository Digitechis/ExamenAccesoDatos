package org.example.examenspringboot.model.daos;

import org.example.examenspringboot.model.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {

    List<Producto> findByPrecioGreaterThan(int precio);
}
