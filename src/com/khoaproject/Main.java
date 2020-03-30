package com.khoaproject;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_1000);
        var report = new TaxReport();

        report.show(calculator);
        report.show(new TaxCalculator2019());
    }

//    Final and Abstract Classes and Methods
//    public static void main(String[] args) {
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for( var control : controls)  {
//            control.render();
//        }
//    }

    //Refactoring Towards OOD
//    public static void main(String[] args) {
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();
//    }
}
