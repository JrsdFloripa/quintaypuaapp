package com.app.quintaypuaapp.modelo;


import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matricula;
    private double total;
    @OneToOne
    @JoinColumn(name = "hospede_ID", referencedColumnName = "ID")
    private Hospede hospede;
    @OneToOne
    @JoinColumn(name = "quartos_registro", referencedColumnName = "registro") 
    private Quartos quartos;
    @OneToOne
    @JoinColumn(name = "servicos_iD", referencedColumnName = "iD") 
    private Servicos servicos;
    private Date dataEntrada;
    private Date dataTermino;
    
        
        
        @Override
        public String toString() {
            return "==============Reserva==================\nHospedagem [matricula=" 
            + matricula + ", quartos=" 
            + quartos + ", servicos=" + servicos + ", hospede="
                    + hospede + ", total=" + total + ", dataEntrada=" 
                    + dataEntrada + ", dataTermino=" + dataTermino
                    + "]";
        }
        public Date getDataEntrada() {
            return dataEntrada;
        }
        public void setDataEntrada(Date dataEntrada) {
            this.dataEntrada = dataEntrada;
        }
        public Date getDataTermino() {
            return dataTermino;
        }
        public void setDataTermino(Date dataTermino) {
            this.dataTermino = dataTermino;
        }
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
        public double getTotal(Date date) {
            return total ;
    } 
    public void setTotal(double total) {
        this.total = total;
    }

}
 