package com.sie.project.enums;

public enum AgeInterval {
    UNDER_18("0-18"),
    BETWEEN_18_AND_30("20-30"),
    BETWEEN_30_AND_40("30-40"),
    BETWEEN_40_AND_50("40-50"),
    OLDER_THAN_50("50+");

    String value;

    AgeInterval(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
