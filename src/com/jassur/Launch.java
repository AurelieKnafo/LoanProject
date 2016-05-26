package com.jassur;

class Launch {

    public static void main(String[] args) {
        Loan withVariationSample = Loan.withVariation(10, 10000, 1, 0.9995);
        Loan withoutVariationSample = Loan.withoutVariation(10, 10000, 1);
        new LoanCostsReporter().report(withVariationSample.calculateCost());
        new LoanCostsReporter().report(withoutVariationSample.calculateCost());
    }

}
