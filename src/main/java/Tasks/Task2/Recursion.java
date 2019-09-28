package Tasks.Task2;

import java.util.Arrays;

public class Recursion {

    // Сортировка Слиянием
    public static void myMergeSort(int[] arr){
        if (arr.length==1){
            return;
        }
        int low = 0;
        int hi = arr.length;
        int middle = low+(hi-low)/2;

        int [] arrA = Arrays.copyOfRange(arr,0, middle);
        int [] arrB = Arrays.copyOfRange(arr, middle, hi);
        myMergeSort(arrA);
        myMergeSort(arrB);

        int[] buff = myMergeAlg(arrA, arrB);
        System.arraycopy(buff, 0, arr, 0, arr.length);

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



    // Cортировка пузырьком
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

    // Рекурсивное суммирование
    public static int sumRecursion(int[] arr, int index) {
        if (index==0) {
            return arr[0];
        }
        return arr[index] + sumRecursion(arr, --index);
    }

    // Факториал
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Бинарный поиск
    public static int binarySearch(int[] arr, int x) {
        return binarySearchAlg(arr, 0, arr.length, x);
    }
    private static int binarySearchAlg(int[] arr, int low, int max, int x) {
        int middle = low + (max - low) / 2;
        if (low + 1 >= max && arr[middle] != x) {
            return -1;
        } else if (arr[middle] == x) {
            return middle;
        } else if (arr[middle] > x) {
            return binarySearchAlg(arr, low, middle, x);
        } else if (arr[middle] < x) {
            return binarySearchAlg(arr, middle, max, x);
        }
        return -1;
    }

   public static void quickSort (int[] arr){
        if (arr.length<=1){
            return;
        }
        quickSortAlg(arr, 0, arr.length-1);
   }


   private static void quickSortAlg (int[] arr, int low, int hi){
        if (low+1>=hi){
            return;
        }
        int middle= low+(hi-low)/2;
        int base = arr[middle];
        int i = low;
        int j = hi;
        while (i<=j){
            while (arr[i]<base){
                i++;
            }
            while (arr[j]>base){
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
       if (low < j)
           quickSortAlg(arr, low, j);
       if (hi > i)
           quickSortAlg(arr, i, hi);
   }


    public static void sort(int[] arr, int low, int hi){
        if(low+1>=hi){
            return;
        }
        int middle=low+(hi-low)/2;
        sort(arr, low,middle);
        sort(arr, middle,hi);
        merge(arr,low,middle,hi);
    }

    private static void merge (int[] arr, int low, int middle, int hi){
        int i=low;
        int j=middle;
        int size=hi-low;
        int[]buff=new int[size];


            for(int k=0;k<buff.length;k++){
                if (j >= hi || i < middle && arr[i]<arr[j]){
                    buff[k]=arr[i++];
                } else {
                    buff[k]=arr[j++];
                }
            }

        System.arraycopy(buff, 0, arr, low, size);

    }

   }



