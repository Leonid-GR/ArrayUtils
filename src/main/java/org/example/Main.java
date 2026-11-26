package org.example;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        ArrayUtils.mergeSort(array);

        System.out.println("\nВідсортований масив:");
        System.out.println(Arrays.toString(array));

        System.out.print("\nВведіть число для пошуку: ");
        int target = scanner.nextInt();

        int result = ArrayUtils.binarySearch(array, target);

        if (result != -1) {
            System.out.println("Число знайдено!");
            System.out.println("Індекс елемента: " + result);
        } else {
            System.out.println("Число не знайдено!");
        }

        scanner.close();
    }
}

