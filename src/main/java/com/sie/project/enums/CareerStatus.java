package com.sie.project.enums;

public enum CareerStatus {
    STUDENT("Elev"),
    UNIVERSITY_STUDENT("Student"),
    UNEMPLOYED("Neangajat"),
    EMPLOYED("Angajat"),
    RETIRED("Pensionat");

    String value;

    CareerStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
