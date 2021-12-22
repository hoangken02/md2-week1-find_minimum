package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        int size;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input your size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);


    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
