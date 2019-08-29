package com.challenge.playground.day1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

    }
}
