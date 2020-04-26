import java.util.Scanner;

public class Main {
    public static int monster(int a,int b){
        //如果bi大于c,也能打败怪物，能力值只能增加bi与c的最大公约数
        while (a % b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int a = sc.nextInt();
            int[] n = new int[num];
            for(int i = 0;i < n.length;i++){
                n[i] = sc.nextInt();
            }
            for(int i = 0;i < n.length;i++){
                if(a >= n[i]){
                    a += n[i];
                }else {
                    a += monster(n[i],a);
                }
            }
            System.out.println(a);
        }
    }
}
