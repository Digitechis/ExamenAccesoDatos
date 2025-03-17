package org.example.examenspringboot.model.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "productos", indexes = {
        @Index(name = "productos_title_idx", columnList = "nombre", unique = true),
})
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productos_id_gen")
    @SequenceGenerator(name = "productos_id_gen", sequenceName = "productos_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String titulo;

    @Column(name = "precio", nullable = false)
    @NotBlank(message = "No puede estar el precio vacío")
    private int precio;

    @Column(name = "stock", nullable = false)
    private int stock;

}
