package com.secondlesson.Task3;

import java.util.Random;

public class thirdTask {

    Random random = new Random();
    int[] array = new int[100];

    public void createArray() {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] arr) {
        System.out.println("\n===============");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        int bubble;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    bubble = array[i];
                    array[i] = array[j];
                    array[j] = bubble;
                }
            }
        }
        return array;
    }

    public static int[] quickSort(int[] arr, int start, int end) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        if (start >= end) {
            return array;
        }

        int middle = start + (end - start) / 2;
        int foundation = array[middle];

        int i = start;
        int j = end;

        while (i <= j) {
            while (array[i] < foundation) {
                i++;
            }
            while (array[j] > foundation) {
                j--;
            }

            if (i <= j) {
                int bubble = array[i];
                array[i] = array[j];
                array[j] = bubble;
                i++;
                j--;
            }
        }

        if (start < j) {
            quickSort(array, start, j);
        }
        if (end > i) {
            quickSort(array, i, end);
        }
        return array;
    }

    public static int[] selectionSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int bubble = array[i];
                array[i] = array[minIndex];
                array[minIndex] = bubble;
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; (j >= 0) && (array[i] < array[j]); j--) {
                array[j + 1] = array[j];
            }
        }
        return array;
    }

    public static int[] countSort(int[] arr, int length) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        int[] counter = new int[length];
        int index = 0;

        for (int i : array) {
            counter[i]++;
        }

        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                array[index] = i;
                index++;
                counter[i]--;

            }
        }
        return array;
    }

    public static void main(String[] args) {
        thirdTask practice = new thirdTask();
        practice.createArray();
        practice.printArray(practice.array);

        System.out.println("\nquickSort");
        practice.printArray(practice.quickSort(practice.array, 0, practice.array.length - 1));

        System.out.println("\nbubbleSort");
        practice.printArray(practice.bubbleSort(practice.array));

        System.out.println("\nselectionSort");
        practice.printArray(practice.selectionSort(practice.array));

        System.out.println("\ninsertionSort");
        practice.printArray(practice.insertionSort(practice.array));

        System.out.println("\ncountSort");
        practice.printArray(practice.countSort(practice.array, practice.array.length));
    }
}
