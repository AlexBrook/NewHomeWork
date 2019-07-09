package LearnClasses;

public class FractionNumbers {

    private int numerator;
    private int denominator;

    public FractionNumbers(int numr, int denr) {
        numerator = numr;
        denominator = denr;
        reduce();

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int calculateGCD(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return denominator;
        }
        return calculateGCD(denominator, numerator % denominator);
    }

    void reduce() {
        int gcd = calculateGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public FractionNumbers add(FractionNumbers fractionTwo) {
        int numer = (numerator * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * denominator);
        int denr = denominator * fractionTwo.getDenominator();
        return new FractionNumbers(numer, denr);
    }

    public FractionNumbers subtract(FractionNumbers fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) -
                (fractionTwo.numerator * denominator);
        int newDenominator = denominator * fractionTwo.denominator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    public FractionNumbers multiply(FractionNumbers fractionTwo) {
        int newNumerator = numerator * fractionTwo.numerator;
        int newDenominator = denominator * fractionTwo.denominator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    public FractionNumbers divide(FractionNumbers fractionTwo) {
        int newNumerator = numerator * fractionTwo.getDenominator();
        int newDenominator = denominator * fractionTwo.numerator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }



}
