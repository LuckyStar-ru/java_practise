package ru.novikov.practika.one.fifth;

public class ForthSolution {

    public void solution(int[] intArray) {
        int max = maxOf(intArray);
        System.out.println("Найден максимум: " + max + ".");
        int duplicatedValues = getDuplicatedValues(intArray, max);
        System.out.println("Найдено повторяющихся значений: " +duplicatedValues + ".");
    }

    private int maxOf(int[] intArray) {
        return getMax(intArray, 0, -1);
    }

    private int getMax(int[] intArray, int i, int maxValue) {
        if (i == intArray.length) return maxValue;

        if (intArray[i] > maxValue) {
            return getMax(intArray, i + 1, intArray[i]);
        } else {
            return getMax(intArray, i + 1, maxValue);
        }
    }

    private int getDuplicatedValues(int[] intArray, int value) {
        return getDuplicatedValues(intArray, 0, value, 0);
    }

    private int getDuplicatedValues(int[] intArray, int i, int value, int duplicatedValues) {
        if (i == intArray.length) return duplicatedValues;

        if (intArray[i] == value) {
            return getDuplicatedValues(intArray, i + 1, value, duplicatedValues + 1);
        } else {
            return getDuplicatedValues(intArray, i + 1, value, duplicatedValues);
        }
    }
}
