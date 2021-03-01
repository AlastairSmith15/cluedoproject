package com.codewithAlastair;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        double Interest = 0;
        double Period = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter value between £1k and £1M");
        }

        while (true) {
            System.out.print("Annual Interest Rate(%): ");
            Interest = scanner.nextDouble();
            if (Interest >= 1 && Interest <= 25)
                break;
            System.out.println("Enter value between 1% and 25%");
        }

        while (true) {
            System.out.print("Period: ");
            Period = scanner.nextDouble();
            if (Period >= 1 && Period <= 30)
                break;
            System.out.println("Input a period up to 30 years, ");
        }

        double rate = Interest/1200;
        double n = Period * 12;
        double factor = Math.pow((1 + rate), n);
        double payment = principal * ((rate * factor)/(factor - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(payment);
        System.out.println(result);
    }
}
