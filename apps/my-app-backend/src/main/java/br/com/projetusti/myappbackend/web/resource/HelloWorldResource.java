package br.com.projetusti.myappbackend.web.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetusti.myappbackend.model.Mensagem;

@RestController
@CrossOrigin
public class HelloWorldResource {

    @GetMapping("/")
    public Mensagem home() {
        return new Mensagem().value("Bem vindo ao My App!!");
    }

}
