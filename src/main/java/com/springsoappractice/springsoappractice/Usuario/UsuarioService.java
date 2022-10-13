package com.springsoappractice.springsoappractice.Usuario;

import java.util.List;

import com.springsoappractice.springsoappractice.gs_prod.Usuario;

public interface UsuarioService {
    Usuario getUsuarioById(Long id);//
    List<Usuario> obtenerTodosLosUsuarios();//
    Usuario actualizarUsuario(Usuario nuevosDatos);
    Usuario guardarNuevoUsuario(Usuario nuevoUsuario);//
    void borrarUsuario(Long id);
}
