package com.proyect.app.Proyect.entidades.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
   @Autowired
   UsuarioRepository usuarioRepository;
    public Usuario save (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario findById(long id){
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteById(long id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public List<Usuario> findByName(String term){
        return usuarioRepository.findByNameLikeIgnoreCase(term+"%");
    }



}
