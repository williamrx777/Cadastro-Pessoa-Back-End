package br.com.projeto.api.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.Modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente,Long>{
    
}
