package com.sie.lab.model;

import java.util.Calendar;
import java.util.Date;

public class Promotie {
    private Integer id;
    private Calendar dataInceput;
    private Calendar dataSfarsit;
    private Double discount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(Calendar dataInceput) {
        this.dataInceput = dataInceput;
    }

    public Calendar getDataSfarsit() {
        return dataSfarsit;
    }

    public void setDataSfarsit(Calendar dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Promotie(Integer id, Calendar dataInceput, Calendar dataSfarsit) {
        this.id = id;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
    }
}
