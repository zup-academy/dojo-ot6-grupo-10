package br.com.zupedu.dojo.ot4dojo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zupedu.dojo.ot4dojo.dto.request.TurmaRq;
import br.com.zupedu.dojo.ot4dojo.repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	private TurmaRepository respository;
	
	
	@PostMapping
	public ResponseEntity<?> save(TurmaRq turmaRq) {
		
	}
}
