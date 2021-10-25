package com.sie.lab.model;

public class ComandaInPromotie {
    private Comanda comanda;
    private Promotie promotie;
    private Double valoareComanda;

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Promotie getPromotie() {
        return promotie;
    }

    public void setPromotie(Promotie promotie) {
        this.promotie = promotie;
    }

    public Double getValoareComanda() {
        this.valoareComanda = this.comanda.getValoareComanda() - this.promotie.getDiscount() * this.getValoareComanda();
        return this.valoareComanda;
    }

    public ComandaInPromotie(Comanda comanda, Promotie promotie) {
        super();
        this.comanda = comanda;
        this.promotie = promotie;
    }
}
