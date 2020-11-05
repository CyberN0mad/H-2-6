package com.company;

public class Main {

    public static void main(String[] args) {
        Process<Integer> t = new Process<>();
        System.out.println("Addition 2 + 2: "+ t.addition(2,2));
        System.out.println("Subtraction 4 - 2: "+ t.subtract(4,2));
        System.out.println("Multiplication 2 * 2: "+ t.multiplication(2,2));
    }
}
