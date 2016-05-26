package com.jassur;

import java.math.BigDecimal;

class LoanCost {

    private int year;
    private BigDecimal currentLoanAmount;
    private BigDecimal rate;
    private BigDecimal monthlyCost;

    LoanCost(int year, BigDecimal currentLoanAmount, BigDecimal rate, BigDecimal monthlyCost) {
        this.year = year;
        this.currentLoanAmount = currentLoanAmount;
        this.rate = rate;
        this.monthlyCost = monthlyCost;
    }

    int getYear() {
        return year;
    }

    BigDecimal getCurrentLoanAmount() {
        return currentLoanAmount;
    }

    BigDecimal getRate() {
        return rate;
    }

    BigDecimal getMonthlyCost() {
        return monthlyCost;
    }
}
