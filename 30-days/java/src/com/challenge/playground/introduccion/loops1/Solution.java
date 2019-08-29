package com.challenge.playground.introduccion.loops1;

import java.util.Scanner;

import static java.lang.String.format;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (N >= 1 && N <= 20) {
            String output = "";
            for (int i = 1; i < 11; i++) {
                output = format("%d x %d = %d \n", N, i, N * i);
                System.out.printf(output);
            }
        }


    }
}