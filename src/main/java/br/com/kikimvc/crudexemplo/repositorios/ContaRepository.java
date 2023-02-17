package br.com.kikimvc.crudexemplo.repositorios;

import br.com.kikimvc.crudexemplo.modelo.Conta;
import br.com.kikimvc.crudexemplo.modelo.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Long> {

    @Query("select c from Conta c where c.pessoa = :pessoa")
    public List<Conta> listarPorPessoa(@Param("pessoa") Pessoa pessoa);

    public List<Conta> findByDescricaoContainingIgnoreCase(String descricao);



}
