package Sort_1;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] array) {
        int gap = array.length;

        while(gap > 1) {
            insertSortGap(array, gap);
            gap = gap / 2;
        }
        insertSortGap(array, 1);
    }

    private static void insertSortGap(int[] array, int gap) {
        for (int bound = 1; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound - gap;

            for(; cur >= 0 && array[cur] > tmp; cur -= gap){
                array[cur + gap] = array[cur];
            }
            array[cur + gap] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 6, 8, 1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
