package flow_control;
import java.util.Scanner;
public class for_continue {
    public static void main(String[] args) {
        //找出所有奇数
//        Scanner s=new Scanner(System.in);
//        System.out.println("请输入范围（0到多少）：");
//        int max=s.nextInt();
//        for(int i=1;i<=max;i++){
//            if(i%2==0){
//                continue;                 //后面的代码不执行，直接进行下一次for循环
//            }
//            System.out.println(i);

        //找出1-100之间所有不为3或5倍数的数字
        for(int i=1;i<=100;i++){
            if(i%3==0||i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
