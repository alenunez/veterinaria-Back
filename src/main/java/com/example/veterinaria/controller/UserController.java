package com.example.veterinaria.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.veterinaria.dto.UsuarioForm;
import com.example.veterinaria.dto.UsuarioDetails;
import com.example.veterinaria.service.UsuarioInterfaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UserController {
@Autowired
private UsuarioInterfaceService service;

    @GetMapping
    public List<UsuarioDetails>list(){
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public UsuarioDetails findById(@PathVariable final Long id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public  UsuarioDetails create(@RequestBody @Valid UsuarioForm data){
        return service.create(data);
    }

    @PutMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public UsuarioDetails updateByTag(@RequestBody @Valid UsuarioForm form, @PathVariable final Long id){
        return service.updateUsuario(form, id);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteByTag(@PathVariable final Long id){
        service.deleteById(id);
    }
    
}
