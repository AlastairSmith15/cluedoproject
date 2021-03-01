package com.codewithAlastair;


import java.util.Scanner;

public class simplestructure {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange"};

        for (int i = 2; i >= 0; i--)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}


