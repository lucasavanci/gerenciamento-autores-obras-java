package com.br.gerenciamento.autores.obras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.gerenciamento.autores.obras.model.AutorModel;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Long>{

    @Query(value = "SELECT COUNT(*) FROM autores WHERE cpf = :cpf", nativeQuery = true)
    Long consultarCpfExistente(@Param("cpf") String cpf);

    @Query(value = "SELECT COUNT(*) FROM autores WHERE email = :email", nativeQuery = true)
    Long consultarEmailExistente(@Param("email") String email);

}
