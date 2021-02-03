package practice.class01;

/**
 * @author : Rick
 * @date : 2021-02-03 18:18
 **/
public class Sort {
    /**
     * 选择排序
     * @param arr
     */
    public static void selectionSort(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            int minValueIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                minValueIndex = arr[j]<arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        for (int end = N-1; end >=0 ; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second-1]>arr[second]){
                    swap(arr, second-1, second);
                }
            }
        }
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 0; end < N; end++) {
            int newValueIndex = end;
            while (newValueIndex-1>=0 && arr[newValueIndex-1]>arr[newValueIndex]){
                swap(arr, newValueIndex-1, newValueIndex);
                newValueIndex--;
            }
        }
    }
    /**
     * 交换数组值
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组
     * @param arr
     */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {11,2,8,44,9,55,1,6,8,7,2,4};
        printArray(arr);
        insertSort(arr);
        printArray(arr);
    }
}
