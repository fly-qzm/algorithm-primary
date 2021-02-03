package practice.class01;

/**
 * @author : Rick
 * @date : 2021-02-03 17:34
 **/
public class PrintBinary {
    public static void print(int num){
        for (int i = 31; i >=0; i--) {
            System.out.print((num & (1<<i))==0 ?"0":"1");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        print(a);
    }
}
