package br.com.zupedu.dojo.ot4dojo.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.zupedu.dojo.ot4dojo.dto.TurmaRequest;

@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, unique = true)
    private LocalDate dataInicio;

    @Column(nullable = false, unique = true)
    private LocalDate dataFim;

    public Turma() {}

    public Turma(TurmaRequest turmaRequest) {
        this.nome = turmaRequest.getNome();
        this.dataInicio = turmaRequest.getDataInicio();
        this.dataFim = turmaRequest.getDataFim();
    }
}
