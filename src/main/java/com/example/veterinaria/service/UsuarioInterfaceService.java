package com.example.veterinaria.service;

import java.util.List;
import com.example.veterinaria.dto.UsuarioForm;

import org.springframework.data.repository.query.Param;
import org.springframework.format.support.FormatterPropertyEditorAdapter;

import com.example.veterinaria.dto.UsuarioDetails;
import com.example.veterinaria.dto.UsuarioForm;

public interface UsuarioInterfaceService {

    /**
     * Metodo para guardar usuarios
    @Param formData
     */

   public UsuarioDetails create(UsuarioForm formData);

        /**
     * Metodo para retornar lista de  usuarios
    
     */
    public List<UsuarioDetails> getAll();

       /**
     * Return author by id
     * @return {@link UsuarioDetails}
     * 
     */
   public  UsuarioDetails findById(Long id);

   
    /**
     * 
     * @param AuthorForm data from form to update
     * @param id is the id of the update author.
     */
   public UsuarioDetails updateUsuario(UsuarioForm form,Long id);


    /**
     * 
     * Delete by id
     * 
     * @param id is the id of the author to delete.
     */
   public  void deleteById(Long id);



}
