package com.app.quintaypuaapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iD;
    private double cafe;
    private double almoco;
    private double limpeza;

    
    public int getiD() {
        return iD;
    }
    public void setiD(int iD) {
        this.iD = iD;
    }
    public double getCafe() {
        return cafe;
    }
    public void setCafe(double cafe) {
        this.cafe = cafe;
    }
    public double getAlmoco() {
        return almoco;
    }
    public void setAlmoco(double almoco) {
        this.almoco = almoco;
    }
    public double getLimpeza() {
        return limpeza;
    }
    public void setLimpeza(double limpeza) {
        this.limpeza = limpeza;
    }
    

   
}
