package com.andrey;

import com.andrey.TailorSeries;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input k here, please: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.print("Input x. X must be in range (-1,1) :");
        double x = scanner.nextDouble();
        try {
            final int MAX_ABS = 1;
            if (Math.abs(x) >= MAX_ABS) {
                throw new Exception("X must be in range (-1,1). Try again...");
            }
            double eps = Math.pow(10, -k);
            double result = TailorSeries.TeilorSum(x, eps);
            System.out.printf("Result = %.3f\n", result);
        } catch(Exception ex) {
            System.out.print(ex.getMessage());
        }
        scanner.close();
    }
}
