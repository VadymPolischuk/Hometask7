package com.company;

public class Fraction {

    private double ch;
    private double zn;


    double getCh() {
        return ch;
    }

    public Fraction() {
        this.ch = 0;
        this.zn = 0;
    }

    public void setCh(double ch) {
        this.ch = ch;
    }

    double getZn() {
        return zn;
    }

    public Fraction(double ch, double zn) {
        this.ch = ch;
        this.zn = zn;
    }

    public void setZn(double zn) {
        this.zn = zn;
    }

    public void FractionSum(Fraction fraction[]) {
        double resultCh = 0;
        double resultZn = 0;
        resultCh = fraction[0].getCh() * fraction[1].getZn() + fraction[1].getCh() * fraction[0].getZn();
        resultZn = fraction[0].getZn()*fraction[1].getZn();
        this.ch = resultCh;
        this.zn = resultZn;


    }
    public void FractionMult(Fraction fraction[]) {
        double resultCh = 0;
        double resultZn = 0;
        resultCh = this.ch*fraction[2].getCh();
        resultZn = this.zn*fraction[2].getZn();
        this.ch = resultCh;
        this.zn = resultZn;

    }

    @Override
    public String toString() {

        return "R: " + this.ch + "/" + this.zn + "\n" +
                "1/R: " + this.zn + "/" + this.ch;
    }
}
