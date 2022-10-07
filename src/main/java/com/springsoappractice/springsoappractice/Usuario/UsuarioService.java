package com.springsoappractice.springsoappractice.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAllUsuarios();
    Usuario saveUsuario(Usuario usuario);
    Usuario modificarUsuario(Usuario usuario,Long id);
    void borrarUsuario(Long id);
}
