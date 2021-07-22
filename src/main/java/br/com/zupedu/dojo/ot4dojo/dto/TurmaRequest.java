package br.com.zupedu.dojo.ot4dojo.dto;

import br.com.zupedu.dojo.ot4dojo.entities.Turma;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TurmaRequest {

    @Size(max = 50)
    private String nome;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    public TurmaRequest() {}

    public TurmaRequest(String nome, LocalDate dataInicio, LocalDate dataFim) {
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

    public Turma converterParaEntidade() {
        return new Turma(nome, dataInicio, dataFim);
    }
}
