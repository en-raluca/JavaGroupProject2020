package com.company;

public class Adriana<dayInWeek> {
    public static void main(String[] args) {
        System.out.println("Adriana");
        int result = justForTest(18);

        int dayInWeek = 4;
        if (dayInWeek == 1) {
            System.out.println("Este luni.");
        } else if (dayInWeek == 2) {
            System.out.println("Este marti");
        } else if (dayInWeek == 3) {
            System.out.println("Este miercuri");
        } else if (dayInWeek == 4) {
            System.out.println("Este joi");
        } else if (dayInWeek == 5) {
            System.out.println("Este vineri");
        } else if (dayInWeek == 6) {
            System.out.println("Este sambata");
        } else {
            System.out.println("Este duminica");
        }
    }


    public static int justForTest(int param) {
        int t, a = 20, b = 10, c = b * 2, d = a + 2 * b - c;
        if (d > param) {
            t = 11;
        } else {
            t = 22;
        }
        boolean boo = false;
        while (t < 13) {
            System.out.println(t);
        }
        t++;
        int[] sir = new int[3];
        sir[0] = 0;
        sir[1] = 1;
        sir[2] = 2;
        boo = sir.length == 3;
        return t * 2;

    }
}


