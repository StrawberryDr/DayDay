import java.util.Arrays;

public class Main {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        //异或：相同为0，不同为1
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }

    public static void main(String[] args) {
        int[] AB = {1,2};
        System.out.println(Arrays.toString(exchangeAB(AB)));
    }
}
