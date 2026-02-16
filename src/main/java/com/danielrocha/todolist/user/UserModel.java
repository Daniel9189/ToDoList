package com.danielrocha.todolist.user;

import lombok.Data;


@Data // Adiciona um getter e setter para todos os atributos da classe
// @Getter para adicionar somente o get
// @Setter para adicionar somente o set
public class UserModel {
    
    private String username;
    private String name;
    private String password;

}

