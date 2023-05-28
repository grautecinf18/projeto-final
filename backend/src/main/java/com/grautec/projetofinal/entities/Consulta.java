package com.grautec.projetofinal.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_consultas")
public class Consulta implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_consulta;
	private String dataDaConsulta;
	private String horaDaConsulta;
	
	@ManyToOne
	@JoinColumn(name="medico_id")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Cliente paciente;
	
	public Consulta() {}

	public Consulta(Integer id_consulta, String dataDaConsulta, String horaDaConsulta, Medico medico,
			Cliente paciente) {
		super();
		this.id_consulta = id_consulta;
		this.dataDaConsulta = dataDaConsulta;
		this.horaDaConsulta = horaDaConsulta;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Integer getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(Integer id_consulta) {
		this.id_consulta = id_consulta;
	}

	public String getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setDataDaConsulta(String dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	public String getHoraDaConsulta() {
		return horaDaConsulta;
	}

	public void setHoraDaConsulta(String horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Cliente getPaciente() {
		return paciente;
	}

	public void setPaciente(Cliente paciente) {
		this.paciente = paciente;
	}
	
	
	
}
