package com.example.veterinaria.repository;


import com.example.veterinaria.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface UsuarioRepository  extends JpaRepository<Usuario,Long>{
    
}

