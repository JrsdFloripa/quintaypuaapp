package com.app.quintaypuaapp.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inscricao;
    private String nome;
    private String funcao;
    private Date entrada;
    private double salario;

    public int getInscricao() {
        return inscricao;
    }
    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public Date getEntrada() {
        return entrada;
    }
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
