package com.company;

public class Adriana {
    public static void main(String[] args) {
        System.out.println("Adriana");
        int result= justForTest(18);
    }


        public static int justForTest(int param){
            int t, a=20, b=10, c=b*2, d=a+2*b-c;
            if(d>param){
                t=11;
            }
            else{
                t=22;
            }
            boolean boo=false;
            while(t<13){
                System.out.println(t);
            }
            t++;
            int[] sir=new int[3];
            sir[0]=0;
            sir[1]=1;
            sir[2]=2;
            boo=sir.length==3;
            return t*2;

        }
    }

