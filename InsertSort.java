package Sort_1;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array) {
        //有序区间 [0 , bound)
        //无序区间 [bound , size)
        for (int bound = 1; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound - 1;

            for(; cur >= 0 && array[cur] > tmp; cur--){
                array[cur + 1] = array[cur];
            }
            array[cur + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 6, 8, 1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
