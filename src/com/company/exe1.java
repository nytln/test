package com.company;

public class exe1 {
    public static void main(String[] args) {

        int num1;
        int i = 0;
        while (i < 10){
            num1 = (int) Math.round(Math.random() * 1000);
            if(num1 <= 200 && num1 >=100){
                System.out.println(num1);
                i++;
            }
        }
    }
}
