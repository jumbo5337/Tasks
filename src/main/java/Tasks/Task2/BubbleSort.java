package Tasks.Task2;

import java.time.LocalDateTime;
import java.util.Date;

public class BubbleSort {


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


}
