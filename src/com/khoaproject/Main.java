package com.khoaproject;

import com.khoaproject.exceptions.AccountException;
import com.khoaproject.exceptions.ExceptionsDemo;
import com.khoaproject.exceptions.InsufficientFundsException;
import com.khoaproject.fundamentals.TaxCalculator2018;
import com.khoaproject.fundamentals.TaxCalculator2019;
import com.khoaproject.fundamentals.TaxReport;
import com.khoaproject.generics.GenericList;
import com.khoaproject.generics.List;
import com.khoaproject.generics.User;
import com.khoaproject.generics.Utils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var max1 = Utils.max(1,3);
        var max2 = Utils.max(new User(10), new User(30));
    }

    //exceptions
//    public static void main(String[] args) {
//        try {
//            ExceptionsDemo.show();
//        } catch (AccountException e) {
//            var cause = e.getCause();
//            System.out.println(cause);
//        }
//    }

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
