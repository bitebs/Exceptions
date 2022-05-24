package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltinExceptions {

    public static void main(String[] args) {
        //processInputExceptions();
        //processDivisionByZero();
        //processDReadFile();
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.err.println("Null pointer");
        }

        s = "1.2";
        try {
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.err.println("Wrong format of the number");
        }

    }

    private static void processInputExceptions(){
        Scanner scanner = new Scanner(System.in);

        boolean state;
        int a = 0;
        do {
            try {
                state = false;
                System.out.println("Enter an integer number: ");
                a = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong format of the number!");
                scanner.nextLine();
                state = true;
            }
        }
        while (state);
        System.out.printf("a=%d%n",a);
    }

    static void processDivisionByZero(){
        int a = 1,b = 0;
        try {
            b = a / 0;
        }
        catch (ArithmeticException e){
            System.err.println("Enter ,division by zero");
            e.printStackTrace();
        }
        System.out.println(b);
    }
    static void processDReadFile(){
        try {
            InputStream is = new FileInputStream("src/com/company/file.txt");
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
            //e.printStackTrace();
        }
    }
}
