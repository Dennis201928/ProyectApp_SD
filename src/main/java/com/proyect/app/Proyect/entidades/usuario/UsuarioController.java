package com.proyect.app.Proyect.entidades.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/usuarios")
@CrossOrigin ({"*"})

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Create
    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    // Read
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable long id){
        return usuarioService.findById(id);
    }

    // Update
    @PutMapping("/update")
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    // Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        usuarioService.deleteById(id);
    }

    // Find all
    @GetMapping("/findAll")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    // Find by name
    @GetMapping("/findByName/{term}")
    public List<Usuario> findByName(@PathVariable String term){
        return usuarioService.findByName(term);
    }
}


