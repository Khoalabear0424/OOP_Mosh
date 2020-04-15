package com.khoaproject;

import com.khoaproject.collections.Customer;
import com.khoaproject.collections.EmailComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("A", "e3"));
        customers.add(new Customer("C", "e2"));
        customers.add(new Customer("B", "e1"));
//        Collections.sort(customers);
        Collections.sort(customers, new EmailComparator());
    }
}

    //generic class
//    public static void main(String[] args) {
//        var max1 = Utils.max(1,3);
//        var max2 = Utils.max(new User(10), new User(30));
//    }

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
