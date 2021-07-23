package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.dto.TurmaRequest;
import br.com.zupedu.dojo.ot4dojo.entities.Turma;
import br.com.zupedu.dojo.ot4dojo.repository.TurmaRepository;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/turma")
public class TurmaController {

	private TurmaRepository turmaRepository;

	public TurmaController(TurmaRepository turmaRepository) {
		this.turmaRepository = turmaRepository;
	}

	@PostMapping
	public ResponseEntity<?> novaTurma(@RequestBody @Valid TurmaRequest turmaRequest) {
		Turma turma = turmaRequest.converterParaEntidade();

		turmaRepository.save(turma);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(turma.getId()).toUri();
		return ResponseEntity.created(uri).build();

	}
}
