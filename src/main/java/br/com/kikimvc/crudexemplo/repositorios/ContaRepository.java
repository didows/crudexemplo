package br.com.kikimvc.crudexemplo.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Long> {

    @Query("select c from Conta c where c.pessoa = :pessoa")
    public List<Conta> listarPorPessoa(@Param("pessoa") Pessoa pessoa);

    public List<Conta> findByDescricaoContainingIgnoreCase(String descricao);



}
