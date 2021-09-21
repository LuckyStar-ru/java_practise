package ru.novikov.practika.two.first;

import java.util.Arrays;

public class ArrayWrapper {
    private int[] array;

    /**
     * Initialize wrapper with array
     * @param intArray wrapped array
     */
    public ArrayWrapper(int... intArray) {
        this.array = intArray;
    }

    /**
     * Generate random int array
     * @param size - size of generated array
     */
    public ArrayWrapper(int size) {
        generateRandomArray(size, 10);
    }

    /**
     * Generate random int array
     * @param size - size of generated array
     * @param max - max value in array
     */
    public ArrayWrapper(int size, int max) {
        generateRandomArray(size, max);
    }

    private void generateRandomArray(int size, int max) {
        this.array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * max);
        }
    }

    public void bubbleSort() {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
