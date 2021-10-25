package com.sie.lab.model;

import com.sie.lab.enums.TipProdus;

public class Produs {
    private String denumire;
    private Double pret;
    private TipProdus tipProdus;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public TipProdus getTipProdus() {
        return tipProdus;
    }

    public void setTipProdus(TipProdus tipProdus) {
        this.tipProdus = tipProdus;
    }

    public Produs(String denumire, Double pret, TipProdus tipProdus) {
        this.denumire = denumire;
        this.pret = pret;
        this.tipProdus = tipProdus;
    }
}
