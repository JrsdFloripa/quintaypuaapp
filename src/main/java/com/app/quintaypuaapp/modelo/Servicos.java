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
    private boolean cafe;
    private boolean almoco;
    private boolean limpeza;


    public int getiD() {
        return iD;
    }
    public void setiD(int iD) {
        this.iD = iD;
    }
    public boolean getCafe() {
        return cafe;
    }
    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }
    public boolean getAlmoco() {
        return almoco;
    }
    public void setAlmoco(boolean almoco) {
        this.almoco = almoco;
    }
    public boolean getLimpeza() {
        return limpeza;
    }
    public void setLimpeza(boolean limpeza) {
        this.limpeza = limpeza;
    }



   
}
