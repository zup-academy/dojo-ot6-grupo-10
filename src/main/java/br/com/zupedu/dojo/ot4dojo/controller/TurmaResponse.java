package br.com.zupedu.dojo.ot4dojo.controller;

import java.time.LocalDate;

import br.com.zupedu.dojo.ot4dojo.entity.Turma;

public class TurmaResponse {

	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	public TurmaResponse(Turma turma) {
		this.nome = turma.getNome();
		this.dataInicio = turma.getDataInicio();
		this.dataFim = turma.getDataFim();
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
	
}
