package com.sie.lab.model;

import com.sie.lab.enums.TipClient;

public class Client {
    private String numeClient;
    private TipClient tipClient;

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public TipClient getTipClient() {
        return tipClient;
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    public Client(String numeClient, TipClient tipClient) {
        super();
        this.numeClient = numeClient;
        this.tipClient = tipClient;
    }
}
