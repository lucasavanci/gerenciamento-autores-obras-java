package com.br.gerenciamento.autores.obras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.gerenciamento.autores.obras.model.ObraModel;

@Repository
public interface ObraRepository extends JpaRepository <ObraModel, Long> {

}
