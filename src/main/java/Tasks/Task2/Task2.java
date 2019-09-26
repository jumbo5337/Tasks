package Tasks.Task2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] arr={0,2,3,5,6,1,23,421,531,532,5234,123,3,4,2,1};
        int [] arr2={1,4,2,6,8,3,54,4,674,3,254,2143,23,4,5,1,23,2};
        int [] arr3={1,2,12,2,3,6,5,3,1213,122,3,55,67,32,44,234,12};
        System.out.println(Arrays.toString(arr) + " " + arr.length);
        Recursion.bubbleSort(arr3);
        Recursion.mySortAlg(arr);
        System.out.println(Arrays.toString(arr) + " " + arr.length);

        System.out.println(Recursion.binarySearch(arr, 5224));
        System.out.println(arr[15]);





    }


}
