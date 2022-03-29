package com.company;

public class exe2 {
    public static void main(String[] args){

        int sum = 0;
        int result = 0;
        int arit = 0;
        int[] array = new int []{188, 181, 156, 162, 173, 152, 169, 193, 185, 183};
        int i = 0;
        while(i < array.length){
            result = result + array[i];
            i++;
            arit = result / array.length;
        }
        System.out.println("result is: " + arit);
    }
}
