package com.proyect.app.Proyect.entidades.usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
@Data 
@Table("usuarios")
public class Usuario {
    @Id
    private long id;
    private String name;
    private String lastname;
    private String dni;
    private String email;
    private String password;

}


