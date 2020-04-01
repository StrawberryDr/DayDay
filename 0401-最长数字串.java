import java.util.Scanner;

public class Main {
    public static String backString(String str){
        String ret = "";
        int count = 0;  //计数：计算数字串的长度
        char[] arr = str.toCharArray();
        for(int i = 0;i < arr.length;i++){
            //如果i号下标的字符为数字，就从i开始往后计算数字字符串的长度
            if('0' <= arr[i] && arr[i] <= '9'){
                count = 1;
                int index = i;
                for(int j = i+1;j < arr.length;j++){
                    if('0' <= arr[j] && arr[j] <= '9'){
                        count++;
                        index = j;
                    }else {
                        break;
                    }
                }
                if(count > ret.length()){
                    ret = str.substring(i,index+1);  //index+1：因为区间左闭右开
                }
            }else {
                continue;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(backString(str));
    }
}
