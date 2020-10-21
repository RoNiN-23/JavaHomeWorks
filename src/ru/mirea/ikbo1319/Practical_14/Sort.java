package ru.mirea.ikbo1319.Practical_14;

import ru.mirea.ikbo1319.Practical_13.Student;

import java.util.ArrayList;

public class Sort implements Comparator {
    Student studentQuick = new Student();
    ArrayList<Student> sort = new ArrayList<>();
    int j = 0;

    public Sort(ArrayList<Student> students) {
        sort = students;
    }

    @Override
    public void quickCompare(double[] arr, int from, int to) {
        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickCompare(arr, from, divideIndex - 1);

            quickCompare(arr, divideIndex, to);
        }

    }

    private int partition(double[] arr, int from, int to) {
        this.sort = sort;
        int rightIndex = to;
        int leftIndex = from;

        double pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private void swap(double[] array, int index1, int index2) {
        double tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        studentQuick = sort.get(index1);
        sort.set(index1, sort.get(index2));
        sort.set(index2, studentQuick);
    }

    public void resQuick() {
        for (int i = sort.size() - 1; i >= 0; i--){
            System.out.println(sort.get(i));
        }
    }

    public int[] mergeCompare(int[] arr) {
        int[] tmp;
        int[] currentSrc = arr;
        int[] currentDest = new int[arr.length];

        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;
        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }


}
