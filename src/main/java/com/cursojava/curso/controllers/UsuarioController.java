package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("correo@correo.com");
        usuario.setTelefono("2214288025");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios(){

        return usuarioDao.getUsuarios();

    }


    @RequestMapping(value = "editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("correo@correo.com");
        usuario.setTelefono("2214288025");
        return usuario;
    }

    @RequestMapping(value = "eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("correo@correo.com");
        usuario.setTelefono("2214288025");
        return usuario;
    }

    @RequestMapping(value = "buscar")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("correo@correo.com");
        usuario.setTelefono("2214288025");
        return usuario;
    }


}
