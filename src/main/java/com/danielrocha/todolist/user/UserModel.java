package com.danielrocha.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data // Adiciona um getter e setter para todos os atributos da classe
// @Getter para adicionar somente o get
// @Setter para adicionar somente o set
@Entity(name="tb_users") // Cria uma tabela no banco com o nome tb_users a partir da classe abaixo
public class UserModel {
    
    @Id // Define o atributo abaixo como PK da tabela
    @GeneratedValue(generator = "UUID") // Geração dos valores do id automaticamente
    private UUID id;

    // @Column(name = "usuário") renomearia na tabela o nome da coluna para usuário
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // Marca a data e o horário que o dado foi gerado
    private LocalDateTime createdAt;
}

