import java.util.Scanner;

public class Main {
    //最小公倍数 = 两数乘积/两数最大公约数

    public static int getNum(int A,int B){  //获得最大公约数
        if(B == 0){
            return A;
        }
        int ret = A % B;
        return getNum(B,ret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int temp = getNum(A,B);
        System.out.println(A * B / temp);
    }
}
