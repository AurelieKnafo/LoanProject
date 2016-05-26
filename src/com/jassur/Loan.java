package com.jassur;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Loan {


    private int nbYears;
    private double amount;
    private int initialRate;
    private double variation;
    private static final int CONSTANT_VARIATION = 1;

    static Loan withoutVariation(int nbYear, double amount, int initialRate) {
        return new Loan(nbYear, amount, initialRate, CONSTANT_VARIATION);
    }

    static Loan withVariation(int nbYear, double amount, int initialRate, double variation) {
        return new Loan(nbYear, amount, initialRate, variation);
    }

    private Loan(int nbYears, double amount, int initialRate, double variation) {
        this.nbYears = nbYears;
        this.amount = amount;
        this.initialRate = initialRate;
        this.variation = variation;
    }

    List<LoanCost> calculateCost() {
        //TODO Make the good algorithm
        List<LoanCost> loanCosts = new ArrayList<>();
        double currentRate = initialRate;
        for (int i = 0; i < nbYears; i++) {
            loanCosts.add(new LoanCost(i,
                    new BigDecimal(amount * currentRate / 100).setScale(2, BigDecimal.ROUND_HALF_UP),
                    new BigDecimal(currentRate).setScale(2, BigDecimal.ROUND_HALF_UP),
                    new BigDecimal(amount * currentRate / 100).setScale(2, BigDecimal.ROUND_HALF_UP)));
            currentRate = currentRate * variation;
        }
        return loanCosts;
    }
}
