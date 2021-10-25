package com.sie.lab.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Comanda {
    private Calendar dataComanda;
    private List<ArticolComanda> articole = new ArrayList<>();
    private Double valoareComanda;
    private Double discount = 0.0;
    private Client client;

    public Comanda(Calendar dataComanda, Client client) {
        super();
        this.dataComanda = dataComanda;
        this.client = client;
    }

    public Calendar getDataComanda() {
        return dataComanda;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDataComanda(Calendar dataComanda) {
        this.dataComanda = dataComanda;
    }

    public List<ArticolComanda> getArticole() {
        return articole;
    }

    public void setArticole(List<ArticolComanda> articole) {
        this.articole = articole;
    }

    public Double getValoareComanda() {
        this.valoareComanda = 0.0;
        for (ArticolComanda a : this.articole) {
            if (a.getProdus() != null) {
                this.valoareComanda += a.getValoareArticol();
                System.out.println("Valoare articol: " + a.getValoareArticol());
            }
        }
        this.valoareComanda -= this.discount * this.valoareComanda;
        return valoareComanda;
    }

    public void setValoareComanda(Double valoareComanda) {
        this.valoareComanda = valoareComanda;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
