package ru.mirea.ikbo1319.Practical_14;

public class Search {

    public static int searchLinear(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("searhing at index: " + i + ", value: " + array[i]);
            if (array[i] == elementToFind) {
                System.out.println("found at index: " + i + ", value: " + array[i]);
                return i;
            }
        }
        System.out.println("not found: " + elementToFind);
        return -1;
    }

    public static int searchBinary(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex: " + startIndex + ", endIndex: " + endIndex + ", middleIndex: " + middleIndex);

            if (array[middleIndex] == elementToFind) {
                System.out.println("found " + elementToFind + " at " + middleIndex);
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public static int searchBinaryRecursive(int array[], int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                return searchBinaryRecursive(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return searchBinaryRecursive(array, middleIndex + 1, endIndex, elementToFind);
            }
        }

        return -1;
    }
}
