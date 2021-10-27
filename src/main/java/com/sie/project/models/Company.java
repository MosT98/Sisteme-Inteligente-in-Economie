package com.sie.project.models;

import java.util.List;

public class Company {

    private List<MarketingStrategy> marketingStrategies;
    private String companyName;
    private Integer budget;

    public Company(List<MarketingStrategy> marketingStrategy){
        this.marketingStrategies = marketingStrategy;
    }

    public Company(List<MarketingStrategy> marketingStrategy, String companyName, Integer budget) {
        this.marketingStrategies = marketingStrategy;
        this.companyName = companyName;
        this.budget = budget;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public List<MarketingStrategy> getMarketingStrategies() {
        return marketingStrategies;
    }

    public void setMarketingStrategies(List<MarketingStrategy> marketingStrategies) {
        this.marketingStrategies = marketingStrategies;
    }
}
