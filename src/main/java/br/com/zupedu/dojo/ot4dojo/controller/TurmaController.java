package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.dto.TurmaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @PostMapping
    public ResponseEntity<?> novaTurma(@RequestBody TurmaRequest turmaRequest){

        return ResponseEntity.ok().body(turmaRequest);

    }
}
