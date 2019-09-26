package Tasks.Task2;

import java.util.Arrays;

public class Recursion {


    public static void sort(int[] arr) {
        if (arr.length > 1) {
            quickSort(arr, 0, arr.length-1);
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

        System.arraycopy(ints, 0, arrA, 0, arrA.length);

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
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    buff = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buff;
                }

            }
        }


    }

    public static int sumRecursion(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        return arr[0] + sumRecursion(Arrays.copyOfRange(arr, 1, arr.length));

    }


    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static int factorial (int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }


    public static int binarySearch (int [] arr, int x){
        return binarySearchAlg(arr, 0, arr.length, x);
    }

    private static int binarySearchAlg (int[] arr, int low, int max, int x){
        int middle = low+(max-low)/2;
        int searched=-1;
        if (low+1 >=max && arr[middle] != x ){
           return -1;
        } else if (arr[middle] == x){
            searched = middle;
            return searched;
        } else if (arr[middle] > x){
           return binarySearchAlg(arr, low, middle, x);
        } else if (arr[middle] < x) {
            return binarySearchAlg(arr, middle, max, x);
        }

        return -1;

    }



}
