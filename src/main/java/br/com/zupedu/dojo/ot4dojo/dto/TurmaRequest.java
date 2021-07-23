package br.com.zupedu.dojo.ot4dojo.dto;

import br.com.zupedu.dojo.ot4dojo.entities.Turma;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;

import org.springframework.util.Assert;

import java.time.LocalDate;

public class TurmaRequest {

    @Size(max = 50)
    private String nome;

    @FutureOrPresent
    private LocalDate dataInicio;
    
    @Future
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
    	Assert.isTrue(dataInicio.isBefore(dataFim), "A data final deve ser maior que a de inicio");
        return new Turma(this);
    }
}
