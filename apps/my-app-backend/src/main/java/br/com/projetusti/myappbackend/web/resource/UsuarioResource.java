package br.com.projetusti.myappbackend.web.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetusti.myappbackend.model.Usuario;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UsuarioResource {

    @GetMapping
    public List<Usuario> findAll() {
        return Collections.singletonList(new Usuario().nome("Wellington Wagner").idade(18));
    }

}
