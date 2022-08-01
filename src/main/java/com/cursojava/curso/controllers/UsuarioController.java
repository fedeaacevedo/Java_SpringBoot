package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Federico");
        usuario.setApellido("Acevedo");
        usuario.setEmail("correo@correo.com");
        usuario.setTelefono("2214288025");

        Usuario usuario1 = new Usuario();
        usuario1.setId(2344L);
        usuario1.setNombre("Ludmila");
        usuario1.setApellido("Lares");
        usuario1.setEmail("ludmila@correo.com");
        usuario1.setTelefono("22142883245");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345345L);
        usuario2.setNombre("Felipe");
        usuario2.setApellido("Acevedo");
        usuario2.setEmail("felipe@correo.com");
        usuario2.setTelefono("22142388025");

        Usuario usuario3 = new Usuario();
        usuario3.setId(456L);
        usuario3.setNombre("Francesca");
        usuario3.setApellido("Acevedo");
        usuario3.setEmail("francesca@correo.com");
        usuario3.setTelefono("2214234025");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
