package com.revature;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                System.out.println("How much memory?");
                System.out.println("Format: #GB OR #MB (decimals OK)");
                String s = scanner.nextLine();
                s = actualMemorySize(s);
                System.out.println(s);
                run = false;
            } catch (Exception e) {
                System.out.println("Incorrect format");
            }
        }
        scanner.close();
    }

    private static String actualMemorySize(String size) {
        double value = Double.parseDouble(size.substring(0, size.length() - 2));
        String units = size.substring(size.length() - 2);
        if (!units.equalsIgnoreCase("MB") && !units.equalsIgnoreCase("GB")) {
            throw new NumberFormatException();
        }
        if (units.equalsIgnoreCase("MB")) {
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
