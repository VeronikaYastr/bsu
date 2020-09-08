package com.andrey;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class TailorSeriesTest {

    @org.junit.jupiter.api.Test
    void teilorSum() {
        double eps = Math.pow(10, -10);
        DecimalFormat df = new DecimalFormat("#.###");
        for (int i = 0; i < 1000; i++) {
            double x = Math.random() - 0.5;
            assertEquals(df.format(Math.atan(x)), df.format(TailorSeries.TeilorSum(x, eps)));
        }
    }
}