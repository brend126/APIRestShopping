package com.testimoniaprints.restfulapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "Locals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String categoria;


    @Column(nullable = false)
    private String nombrePropietario;

    @OneToOne
    @JoinColumn(name = "piso_id", referencedColumnName = "id", nullable = false)
    private Piso piso;


}

