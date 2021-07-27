package br.com.zupedu.dojo.ot4dojo.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.validator.constraints.Length;

import br.com.zupedu.dojo.ot4dojo.entity.Turma;

public class TurmaRq {
	
	@NotEmpty
	@Length(max=50)
	private String nome;
	@NotNull
	@Future
	private LocalDate dataInicio;
	@NotNull
	@Future
	private LocalDate dataFim;

	@JsonCreator
	public TurmaRq(@NotEmpty @Length(max = 50) String nome, @NotNull @Future LocalDate dataInicio,
			@NotNull @Future LocalDate dataFim) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
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

	public Turma toModel() {
		return new Turma(
				nome,
				dataInicio,
				dataFim);
	}
	
}
