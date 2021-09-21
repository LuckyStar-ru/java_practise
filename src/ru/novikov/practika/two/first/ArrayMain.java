package ru.novikov.practika.two.first;

public class ArrayMain {
    public static void main(String[] args) {
        //int[] array = {4, 3, 5, 1, 0, 7, 5, 11};
        ArrayWrapper wrapper = new ArrayWrapper(10, 50);
        System.out.println(wrapper);
        wrapper.bubbleSort();
        System.out.println(wrapper);
    }
}
