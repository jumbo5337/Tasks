package Tasks.Task2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] arr={0,2,3,5,6,1,23,421,531,532,5234,123,3,4,2,1};


        Recursion.sort(arr,0,arr.length);
        int[] arr2={1,4,2,6,8,3,54,4,674,3,254,2143,23,4,5,1,23,2};
        int[] arr4={124,325,52,2,1};

        System.out.println(Arrays.toString(arr) + " - До сортировки");
        Recursion.bubbleSort(arr);
        System.out.println(Arrays.toString(arr) + " - После сортировки");

        System.out.println(Arrays.toString(arr2) + " - До сортировки");
        Recursion.myMergeSort(arr2);
        System.out.println(Arrays.toString(arr2) + " - После сортировки");

        System.out.println(Arrays.toString(arr4) + " - До сортировки");
        Recursion.quickSort(arr4);
        System.out.println(Arrays.toString(arr4) + " - После сортировки");



        int mySum = Recursion.sumRecursion(arr, arr.length - 1);
        int check = Arrays.stream(arr).sum();
        System.out.println("Результаты суммирования :" + mySum + "\n" + "Суммирование стримами :" +check);
        int[] arr3 = Recursion.myMergeAlg(arr, arr2);
        System.out.println(Arrays.toString(arr) + " :Первый Массив \n" + Arrays.toString(arr) + " :Второй Массив \n"
        +Arrays.toString(arr3) + " :Результат слияния");


        System.out.println("Бинарный поиск элемента 54 в arr3 " + Recursion.binarySearch(arr3, 54)+ "\n" +
                "Проверка : " + (54==arr3[Recursion.binarySearch(arr3, 54)]));

        System.out.println("Факториал числа 5: " + Recursion.factorial(5));


        System.out.println("Бинарный поиск элемента 0 в arr3 " + Recursion.binarySearch(arr3, 0)+ "\n" +
                "Проверка : " + (0==arr3[Recursion.binarySearch(arr3, 0)]));

        System.out.println("Бинарный поиск элемента 5234 в arr3 " + Recursion.binarySearch(arr3, 5234)+ "\n" +
                "Проверка : " + (5234==arr3[Recursion.binarySearch(arr3, 5234)]));

        System.out.println("Бинарный поиск элемента 66 в arr3 " + Recursion.binarySearch(arr3, 66));









    }


}
