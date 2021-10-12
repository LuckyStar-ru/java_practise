package ru.novikov.practika.one.sixth;

public class Sorting {
    public static void selectionSort (Comparable[] array) {
        int min;
        Comparable temp;
        for (int index = 0; index < array.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < array.length; scan++)
                if (array[scan].compareTo(array[min]) < 0)
                    min = scan;
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
    }

    public static void quickSort(Comparable[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        // Центр
        int middle = low + (high - low) / 2;
        // Опорный элемент
        Comparable opora = array[middle];

        // Разделение на подмассивы
        int i = low, j = high;
        while (i <= j) {
            while (opora.compareTo(array[i]) > 0) {
                i++;
            }

            while (opora.compareTo(array[j]) < 0) {
                j--;
            }

            if (i <= j) {
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // Вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
