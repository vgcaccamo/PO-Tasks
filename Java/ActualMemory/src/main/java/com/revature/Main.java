package com.revature;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String s = actualMemorySize("900GB");
        System.out.println(s);
    }

    private static String actualMemorySize(String size) {
        double value = Double.valueOf(size.substring(0, size.length() - 2));
        if (size.substring(size.length() - 2).toUpperCase().equals("MB")) {
            value /= 1000;
        }
        value *= .93;
        if (value >= 1) {
            return new DecimalFormat("#.##").format(value) + "GB";
        } else {
            value *= 1000;
            return (int) value + "MB";
        }
    }
}
