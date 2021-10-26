package com.sie.project.models;

import com.sie.project.enums.AgeInterval;
import com.sie.project.enums.CareerStatus;
import com.sie.project.enums.MonthlyIncomeInterval;

public class TargetAudience {

    private CareerStatus careerStatus;
    private AgeInterval ageInterval;
    private MonthlyIncomeInterval monthlyIncomeInterval;

    public TargetAudience(MonthlyIncomeInterval monthlyIncomeInterval) {
        this.monthlyIncomeInterval = monthlyIncomeInterval;
    }

    public TargetAudience(AgeInterval ageInterval) {
        this.ageInterval = ageInterval;
    }

    public TargetAudience(CareerStatus careerStatus) {
        this.careerStatus = careerStatus;
    }

    public CareerStatus getCareerStatus() {
        return careerStatus;
    }

    public void setCareerStatus(CareerStatus careerStatus) {
        this.careerStatus = careerStatus;
    }

    public AgeInterval getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(AgeInterval ageInterval) {
        this.ageInterval = ageInterval;
    }

    public MonthlyIncomeInterval getMonthlyIncomeInterval() {
        return monthlyIncomeInterval;
    }

    public void setMonthlyIncomeInterval(MonthlyIncomeInterval monthlyIncomeInterval) {
        this.monthlyIncomeInterval = monthlyIncomeInterval;
    }
}
