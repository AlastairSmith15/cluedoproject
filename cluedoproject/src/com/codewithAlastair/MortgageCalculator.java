package com.codewithAlastair;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int Principal = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Annual Interest Rate(%):");
        Double Interest = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Period:");
        Double Period = Double.parseDouble(scanner.nextLine().trim());
        Double rate = Interest/1200;
        Double n = Period * 12;
        Double factor = Math.pow((1 + rate), n);
        Double payment = Principal * ((rate * factor)/(factor - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(payment);
        System.out.println(result);
    }
}
