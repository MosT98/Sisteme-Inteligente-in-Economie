package com.sie.lab.model;

public class ArticolComanda {
    private Produs produs;
    private Comanda comanda;
    private Double cantitate;
    private Double valoareArticol;
    private Double discountPeArticol = 0.0;

    public Produs getProdus() {
        return produs;
    }

    public Double getDiscountPeArticol() {
        return discountPeArticol;
    }

    public void setDiscountPeArticol(Double discountPeArticol) {
        this.discountPeArticol = discountPeArticol;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Double getCantitate() {
        return cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    public Double getValoareArticol() {
        valoareArticol = this.produs.getPret() * this.cantitate - this.discountPeArticol * this.produs.getPret() * this.cantitate;
        return valoareArticol;
    }

    public void setValoareArticol(Double valoareArticol) {
        this.valoareArticol = valoareArticol;
    }

    public ArticolComanda(Produs produs, Comanda comanda, Double cantitate) {
        super();
        this.produs = produs;
        this.comanda = comanda;
        this.cantitate = cantitate;
    }

}
