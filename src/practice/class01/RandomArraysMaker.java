package practice.class01;

import java.sql.SQLOutput;
import java.util.Map;

/**
 * @author : Rick
 * @date : 2021-02-05 17:15
 * 等概率随机数组生成器
 **/
public class RandomArraysMaker {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    // 交换arr的i和j位置上的值
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //等概率随机生成长度在[0,maxLen],值为[0,maxValue]的数组
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * (maxLen + 1));
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * (maxValue + 1));
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    /**
     * 备份原数组
     *
     * @param arr
     * @return
     */
    public static int[] copyArrays(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    //从小带大排序
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                return false;
            }
            min = Math.max(min, arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] arr = lenRandomValueRandom(100, 100);
            print(arr);
            bubbleSort(arr);
            print(arr);
            System.out.println(isSorted(arr) ? "成功" : "失败");
        }

    }
}
