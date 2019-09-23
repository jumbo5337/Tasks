package Tasks.Task2;

import java.util.Arrays;

public class MergeSort {


    public static void sort(int[] arr) {
        if (arr.length > 1) {
           mergeSortAlg(arr, 0, arr.length);
        }
    }

    private static void mergeSortAlg(int[] arr, int low, int high) {
        if (low + 1 < high) {
            int middle = (low + high) >>> 1;
            mergeSortAlg(arr, low, middle);
            mergeSortAlg(arr, middle, high);
            int size = high - low;
            int[] buff = new int[size];
            int i = low;
            int j = middle;

            for (int k = 0; k < size; k++) {
                if (j >= high || i < middle && arr[i] < arr[j]) {  //j >= high || i < mid
                    buff[k] = arr[i++];
                } else {
                    buff[k] = arr[j++];
                }

            }
            System.arraycopy(buff, 0, arr, low, size);
        }
    }

    public static void mySortAlg(int[] arrA) {
        if (arrA.length < 2) {
            return;
        }

        int[] arrB = new int[arrA.length / 2];
        System.arraycopy(arrA, 0, arrB, 0, arrA.length / 2);

        int[] arrC = new int[arrA.length - arrA.length / 2];
        System.arraycopy(arrA, arrA.length / 2, arrC, 0, arrA.length - arrA.length / 2);

         mySortAlg(arrB);
         mySortAlg(arrC);

        int[] ints = myMergeAlg(arrB, arrC);

        System.arraycopy(ints, 0, arrA,0,arrA.length);

    }

    public static int[] myMergeAlg(int[] firstArr, int[] secondArr) {
        int lenght = firstArr.length + secondArr.length;
        int buff[] = new int[lenght];
        int i = 0; // курсор первого массива;
        int j = 0; // кусор второго массива;

        for (int k = 0; k < lenght; k++) {
            if (j >= secondArr.length || i < firstArr.length && firstArr[i] < secondArr[j]) {
                buff[k] = firstArr[i++];
            } else {
                buff[k] = secondArr[j++];
            }
        }
        return buff;
    }

    public static void bubbleSort(int[] a) {
        int buff;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    buff = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buff;
                }

            }
        }


    }

    public static int sumRecursion (int[] arr){
        if (arr.length ==1){
            return arr[0];
        }

        return arr[0]+sumRecursion(Arrays.copyOfRange(arr, 1, arr.length));

    }


}
