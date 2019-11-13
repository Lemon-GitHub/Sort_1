package Sort_1;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] array) {
        //[0, bound) 有序区间
        //[bound, size) 无序区间
        for(int bound = 0; bound < array.length; bound++) {
            for(int cur = bound + 1; cur < array.length; cur++) {
                if(array[bound] > array[cur]) {
                    swap(array, cur, bound);
                }
            }
        }
    }

    private static void swap(int[] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 6, 8, 1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
