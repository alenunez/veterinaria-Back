package com.example.veterinaria.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.veterinaria.dto.UsuarioForm;
import com.example.veterinaria.dto.UsuarioDetails;
import com.example.veterinaria.entity.Usuario;
import com.example.veterinaria.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsuarioServiceImpl implements UsuarioInterfaceService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UsuarioDetails create(UsuarioForm formData){
        Usuario usuario = formData.GetEntity();
        UsuarioDetails usuario_details = new UsuarioDetails();
        usuario_details.setEntity(repository.save(usuario));
        return usuario_details;
    }

    @Override
    public List<UsuarioDetails> getAll(){
        Iterable<Usuario> lista_usuarios = repository.findAll();
        List<UsuarioDetails> list_details = new ArrayList<>();

        lista_usuarios.forEach(usuario->{
            UsuarioDetails details = new UsuarioDetails();
            details.setEntity(usuario);
            list_details.add(details);
            
        });
        return list_details;
    }

    @Override
    public UsuarioDetails findById(Long id){
        UsuarioDetails usuarioDetail = new UsuarioDetails();
        Usuario usuario = repository.getById(id);
        usuarioDetail.setEntity(usuario);
        return usuarioDetail;        
    }

    @Override
    public UsuarioDetails updateUsuario(UsuarioForm form, Long id){
        Usuario usuario = repository.getById(id);
        form.setEntity(usuario);
        UsuarioDetails usuario_detail = new UsuarioDetails();
        usuario_detail.setEntity(repository.save(usuario));
        return usuario_detail;
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }

    
}