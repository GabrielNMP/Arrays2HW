package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Task 1.
        System.out.println("Task 1. Answers. ");
        int[] arr = generateRandomArray();
        int totalSum = 0;
        //System.out.println(" Random array " + Arrays.toString(arr)); для проверки
        for (int j : arr) {
            totalSum = totalSum + j;
        }
        System.out.println(" Total sum for month = " + totalSum + " RUB. ");

// Task 2.
        System.out.println("_________________");
        System.out.println("Task 2. Answers. ");
        int maxPerDay = 0;
        int minPerDay = 200_000;
        for (int j : arr) {
            if (j > maxPerDay) {
                maxPerDay = j;
            }
            if (j < minPerDay) {
                minPerDay = j;
            }
        }
        System.out.println(" Maximum spending per day = " + maxPerDay + " RUB.");
        System.out.println(" Minimum spending per day = " + minPerDay + " RUB.");

// Task 3.
        System.out.println("_________________");
        System.out.println("Task 3. Answers. ");
        float average = totalSum / 30f;
        System.out.println(" Average sum for month = " + average + " RUB.");


// Task 4.
        System.out.println("_________________");
        System.out.println("Task 4. Answers. ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i-- ) {
            System.out.print(reverseFullName[i]);
        }


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
