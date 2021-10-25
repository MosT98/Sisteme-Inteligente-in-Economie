package com.sie.project.enums;

public enum MonthlyIncomeInterval {
    UNDER_1000("0-1000"),
    BETWEEN_1000_AND_2000("1000-2000"),
    BETWEEN_2000_AND_5000("2000-5000"),
    ABOVE_5000("5000+");

    String value;

    MonthlyIncomeInterval(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
