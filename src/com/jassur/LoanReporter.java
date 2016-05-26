package com.jassur;

import java.util.List;

class LoanCostsReporter {

    void report(List<LoanCost> loanCosts) {
        for (LoanCost loanCost : loanCosts) {
            System.out.print("Année :" + loanCost.getYear());
            System.out.print(" Montant du prêt :" + loanCost.getCurrentLoanAmount() + " euros");
            System.out.print(" Variation du taux :" + loanCost.getRate() + "%");
            System.out.print(" Côut mensuel du prêt :" + loanCost.getMonthlyCost() + " euros");
            System.out.print("\n");
        }
    }

}
