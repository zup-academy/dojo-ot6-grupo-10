package br.com.zupedu.dojo.ot4dojo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	@Deprecated
	public Turma() {
	}
	
	public Turma(Long id, String nome, LocalDate dataInicio, LocalDate dataFim) {
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}
	
}
