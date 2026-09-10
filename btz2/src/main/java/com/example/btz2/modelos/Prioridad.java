package com.example.btz2.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prioridad")

public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="nombre", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(name="nivel", nullable = false, unique = false)
    private int nivel;

}
