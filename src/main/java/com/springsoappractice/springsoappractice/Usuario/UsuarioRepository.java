package com.springsoappractice.springsoappractice.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsoappractice.springsoappractice.gs_prod.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{}
