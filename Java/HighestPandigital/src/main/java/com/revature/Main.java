package com.revature;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //this will store the solution
        int largest = 0;

        //this int tracks the principle number being multiplied against
        mainLoop:
        for (int i = 2; i < 10000; i++) {
            StringBuilder sb = new StringBuilder();

            //j tracks the number currently being multiplied against the principle
            for (int j = 1; sb.length() < 9; j++) {
                sb.append(i * j);
                if (sb.toString().contains("0")) continue mainLoop;
            }

            if (sb.length() == 9) {
                HashSet<Character> digitSet = new HashSet<>();

                //HashSet filters out repeated characters
                for (char ch : sb.toString().toCharArray()) {
                    digitSet.add(ch);
                }
                if (digitSet.size() == 9 && Integer.parseInt(sb.toString()) > largest) {
                    largest = Integer.parseInt(sb.toString());
                }
            }
        }
        System.out.println(largest);
    }
}
