package com.danielrocha.todolist.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
Modificadores:
public
private
protected 
*/ 
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired // O Spring cria o objeto pra você e entrega pronto para uso
    private IUserRepository userRepository;
    /*
    Tipos de retorno:
    String
    Integer
    Double
    Float
    Char
    Date
    Void
    */
    /*
    Body
    */
    @PostMapping("/")
    public UserModel createUser(@RequestBody UserModel userModel) {
        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}
