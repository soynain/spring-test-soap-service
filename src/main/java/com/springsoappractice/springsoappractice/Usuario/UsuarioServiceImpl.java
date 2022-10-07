package com.springsoappractice.springsoappractice.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario,Long id) {
        Usuario usuarioAModificar=usuarioRepository.findById(id).get();
        usuarioAModificar.setNombreCompleto(usuario.getNombreCompleto());
        usuarioAModificar.setEdad(usuario.getEdad());
        return usuarioRepository.save(usuarioAModificar);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
    
}
