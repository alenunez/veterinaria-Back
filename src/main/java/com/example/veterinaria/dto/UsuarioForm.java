package com.example.veterinaria.dto;


import java.util.Date;
import javax.validation.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.veterinaria.entity.Usuario;

@Data
@NoArgsConstructor
public class UsuarioForm {

    @NotNull(message = "Este campo es obligatorio")
    private String first_name;

    @NotNull(message = "Este campo es obligatorio")
    private String last_name;

    @NotNull(message = "Este campo es obligatorio")
    private String password;

    @NotNull(message = "Este campo es obligatorio")
    private int document;

    private Date birth_date;

    public Usuario GetEntity() {
        Usuario usuario = new Usuario();
        setEntity(usuario);
        return usuario;
    }

    public void setEntity(Usuario usuario) {
        usuario.setFirst_name(first_name);
        usuario.setLast_name(last_name);
        usuario.setPassword(password);
        usuario.setDocument(document);
        usuario.setBirth_date(birth_date);

    }

}
