package com.challenge.playground.introduccion.loopsII;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        int n = 1;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            if ((n >= 1 && n <= 15) && (a >= 0 && a <= 50) && (b >= 0 && b <= 50)) {
                for (int j = 0; j < n; j++) {
                    a += (int) Math.pow(2, j) * b;
                    System.out.println(String.format("%d", a) + " ");
                }
                System.out.println();
            }
        }
        in.close();

    }
}