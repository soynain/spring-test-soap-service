package com.springsoappractice.springsoappractice.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsoappractice.springsoappractice.gs_prod.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario actualizarUsuario(Usuario nuevosDatos) {
        Usuario usuarioAModificar=usuarioRepository.findById(nuevosDatos.getId()).get();
        usuarioAModificar.setNombreCompleto(nuevosDatos.getNombreCompleto());
        usuarioAModificar.setEdad(nuevosDatos.getEdad());
        return usuarioRepository.save(usuarioAModificar);
    }

    @Override
    public Usuario guardarNuevoUsuario(Usuario usuarioAGuardar) {
        return usuarioRepository.save(usuarioAGuardar);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

   
    
}
