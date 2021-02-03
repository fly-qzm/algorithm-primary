package practice.class01;

/**
 * @author : Rick
 * @date : 2021-02-03 17:53
 **/
public class SumOfFactorial {
    /**
     * 阶乘和
     * @param N
     * @return
     */
    public static long f1(int N){
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    /**
     * 阶乘和
     * @param N
     * @return
     */
    public static long f2(int N){
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur *= i;
            ans += cur;
        }
        return ans;
    }

    /**
     * 阶乘
     * @param N
     * @return
     */
    public static long factorial(int N){
        long ans = 1L;
        for (int i = 1; i <= N; i++) {
            ans *=i;
        }
        return ans;
    }


    public static void main(String[] args) {
        int a = 10;
        System.out.println(factorial(a));
        System.out.println(f1(a));
        System.out.println(f2(a));


    }
}
