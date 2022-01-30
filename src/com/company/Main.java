package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorting an array in descending order using bubble sort: ");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}