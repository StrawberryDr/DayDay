import java.util.Scanner;

public class Main {
    //求出斐波那契数列，直到出现>=数字n的第一个斐波那契数num1
    //此时和n之间相差最小的不是num1，就是num1前面的一个数字num2
    public static int Fibonacci(int n){
        //递归--->斐波那契数列
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    public static int countStep(int n){
        int temp = 0;
        int num1 = 0;  //记录第一个比n大的斐波那契数
        while (temp >= 0){
            if(Fibonacci(temp) >= n){
                num1 = Fibonacci(temp);
                break;
            }else {
                temp++;
            }
        }
        int num2 = Fibonacci(temp-1);  //得到前一个数
        return minStep(Math.abs(num1-n),Math.abs(num2-n));
    }
    public static int minStep(int x,int y){
        if(x - y >= 0){
            return y;
        }else {
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStep(n));
    }
}
