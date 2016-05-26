package com.jassur;

import com.jassur.controllers.LoanCostsCalculator;
import com.jassur.models.Loan;
import com.jassur.views.LoanCostsReporter;

class Launch {

    public static void main(String[] args) {
        Loan withVariationSample = Loan.withVariation(10, 10000, 1, 0.9995);
        Loan withoutVariationSample = Loan.withoutVariation(10, 10000, 1);
        LoanCostsCalculator loanCostsCalculator = new LoanCostsCalculator();
        new LoanCostsReporter().report(loanCostsCalculator.calculate(withVariationSample));
        new LoanCostsReporter().report(loanCostsCalculator.calculate(withVariationSample));
    }

}
