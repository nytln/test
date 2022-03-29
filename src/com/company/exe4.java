package com.company;

public class exe4 {
    public static void main(String[] args){

        int[] array = new int []{188, 181, 156, 162, 173, 152, 169, 193, 185, 183};
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("highest number is: " + maxIndex);
    }
}
