package com.example.mcalc;

public class MortgageModel {
    private double p;
    private double a;
    private double i;
    public MortgageModel(String p, String a, String i){
        this.p = Double.parseDouble(p);
        this.a = Double.parseDouble(a);
        this.i = Double.parseDouble(i);
    }
    public String computePayment(){
        double interest = (i / 100) / 12;
        double months = a * 12;
        double principle = p;
        double result = (interest * principle)/(1 - (Math.pow(1 + interest, -months)));
        return String.format("%.2f", result);
    }

    public static void main(String[] args) {
        MortgageModel myModel = new MortgageModel("700000", "25", "2.75");
        System.out.println(myModel.computePayment());
        myModel = new MortgageModel("300000", "20", "4.50");
        System.out.println(myModel.computePayment());
    }

}
