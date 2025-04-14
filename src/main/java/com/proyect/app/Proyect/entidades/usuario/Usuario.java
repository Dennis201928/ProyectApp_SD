package com.proyect.app.Proyect.entidades.usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
@Data 
@Table("usuarios")
public class Usuario {
    @Id
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;

}
