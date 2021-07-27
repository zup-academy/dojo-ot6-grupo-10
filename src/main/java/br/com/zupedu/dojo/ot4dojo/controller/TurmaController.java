package br.com.zupedu.dojo.ot4dojo.controller;

import java.net.URI;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zupedu.dojo.ot4dojo.dto.request.TurmaRq;
import br.com.zupedu.dojo.ot4dojo.entity.Turma;
import br.com.zupedu.dojo.ot4dojo.repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	private TurmaRepository repository;
	
	private SimpleDateFormat dateFormat;
	
	@PostMapping
	@Transactional
	public ResponseEntity<TurmaResponse> save(@RequestBody @Valid TurmaRq turmaRq, UriComponentsBuilder uriBuilder) {
		
		Turma turma = turmaRq.toModel();
		
		repository.save(turma);
		
		URI uri = uriBuilder.path("/turma/{id}").buildAndExpand("{id}", turma.getId()).toUri();
		return ResponseEntity.created(uri).body(new TurmaResponse(turma));
		
	}
}
