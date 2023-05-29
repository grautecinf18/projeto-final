package com.grautec.projetofinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grautec.projetofinal.entities.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{

	
	@Query("select c from Consulta c where c.paciente.idCliente = :id")
	List<Consulta> consultasPacienteId(Integer id);
}
