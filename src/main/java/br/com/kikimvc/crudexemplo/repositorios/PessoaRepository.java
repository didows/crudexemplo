package br.com.kikimvc.crudexemplo.repositorios;

import br.com.kikimvc.crudexemplo.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {





}
