package com.app.quintaypuaapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numero;
    private int cnpj;
    private String nome;
    private String email;
    private String senha;
    @OneToOne
    @JoinColumn(name = "quartos_registro", referencedColumnName = "registro")
    private Quartos quartos;
    @OneToOne
    @JoinColumn(name = "servicos_iD", referencedColumnName = "iD")
    private Servicos servicos;
    @OneToOne
    @JoinColumn(name = "funcionario_inscricao", referencedColumnName = "inscricao")
    private Funcionario funcionario;
    @OneToOne
    @JoinColumn(name = "estoque_codigo", referencedColumnName = "codigo")
    private Estoque estoque;


    public Quartos getQuartos() {
        return quartos;
    }
    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }
    public Servicos getServicos() {
        return servicos;
    }
    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Estoque getEstoque() {
        return estoque;
    }
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCpf(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
