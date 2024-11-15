package com.app.quintaypuaapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quartos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registro;
    private int numeroCamas;
    private double diaria;
    private double pacote;
    private int banheiros;
    


    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getNumeroCamas() {
        return numeroCamas;
    }
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    public double getDiaria() {
        return diaria;
    }
    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
    public double getPacote() {
        return pacote;
    }
    public void setPacote(double pacote) {
        this.pacote = pacote;
    }
    public int getBanheiros() {
        return banheiros;
    }
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }
}
