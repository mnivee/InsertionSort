package com.company;

public class Main {

    public static void main(String[] args) {
	int array[] = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
	InsertionSort(array);
	printArray(array);
    }

    public static void InsertionSort(int array[]){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

    }

    static void printArray(int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
            System.out.println();
        }

    }
}

