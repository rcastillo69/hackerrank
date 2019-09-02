package com.challenge.playground.introduccion.staticblock;

import java.util.Scanner;

public class Solution {
    private static boolean flag;
    private static int B;
    private static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if ((B >= -100 && B <= 100) && (H >= -100 && H <= 100)) {
            if (B <= 0 || H <= 0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            } else {
                flag = true;
            }
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
