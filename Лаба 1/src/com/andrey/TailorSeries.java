
package com.andrey;

public class TailorSeries {
    public static double TeilorSum(double x, double eps) {
        double sum = 0;
        int i = 1;
        while (Math.abs(memberSequence(i, x)) >= eps) {
            sum += memberSequence(i, x);
            i++;
        }
        return sum;
    }

    private static double memberSequence(int n, double x) {
        return Math.pow(-1, n - 1) * Math.pow(x, 2 * n - 1) / (2 * n - 1);
    }
}