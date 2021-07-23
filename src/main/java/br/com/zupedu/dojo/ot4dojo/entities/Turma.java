package br.com.zupedu.dojo.ot4dojo.entities;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;

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

    public Turma(@Valid String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
