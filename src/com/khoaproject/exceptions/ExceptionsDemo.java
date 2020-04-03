package com.khoaproject.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws AccountException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Autocloseable
//public class ExceptionsDemo {
//    public static void show(){
//
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileReader("...");
//        ){
//            var val = reader.read();
//        } catch (IOException e) {
//            System.out.println("Could not read data");;
//        }
//    }
//}
