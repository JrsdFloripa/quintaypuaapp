package com.app.quintaypuaapp.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matricula;
    @ManyToOne
    @JoinColumn(name = "quartos_registro", referencedColumnName = "registro") 
    private Quartos quartos;
    @ManyToOne
    @JoinColumn(name = "servicos_iD", referencedColumnName = "iD") 
    private Servicos servicos;
    @ManyToOne
    @JoinColumn(name = "hospede_ID", referencedColumnName = "ID")
    private Hospede hospede;
    private double total;


    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
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
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

}
 