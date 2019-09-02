package com.challenge.playground.introduccion.endoffile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}
