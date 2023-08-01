package br.com.projeto.api.Controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Modelo.Cliente;
import br.com.projeto.api.Repositorio.Repositorio;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Controle {
    
    @Autowired
    private Repositorio repositorio;

    @GetMapping
    public Iterable<Cliente> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente postar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Cliente atualizar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }

    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable Long codigo){
        repositorio.deleteById(codigo);
    }
}
