package com.challenge.playground.introduccion.datatype;

import java.util.Scanner;


class Solution {
    public static void printOut(int index) {
        String outputs[] = {"* byte", "* short", "* int", "* long"};
        for (int i = 0; i < 4; i++) {
            if (index <= i) {
                System.out.println(outputs[i]);
            }

        }
    }

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    printOut(0);
                } else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    printOut(1);

                } else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    printOut(2);
                } else System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}



