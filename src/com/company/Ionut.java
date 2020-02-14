package com.company;

public class Ionut {

    public static void SumCalculation(){
        int a=2, b=5;
        int s=a+b;
        System.out.println("Rezultatul sumei este: "+s);
    }

    public static void printFirst12FibonacciNo(){
        int [] arrayFibonacci=new int [12];
        arrayFibonacci[0]=1;
        arrayFibonacci[1]=1;
        for(int i=0;i<=11;i++) {
            if (i >= 2) {
                arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
            }
            System.out.println("The first 12 Fibonnacci elements are arrayFibonacci["+i+"] : " + arrayFibonacci[i]);
        }
    }
}
