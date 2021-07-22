package flow_control;
import java.util.Scanner;
public class switch_ {
    public static void main(String[] args) {
//        int a = 3;
//        switch (a){
//            default:
//                System.out.println(3);
////                break;   //default若放在前面会首先执行，如default后没有break，会继续向下执行，遇到break推出switch
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//        }
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int M=s.nextInt();
        switch(M){
            case(1):
                System.out.println("一月，冬季");
                break;
            case(2):
                System.out.println("二月，冬季");
                break;
            case(3):
                System.out.println("三月，春季");
                break;
            case(4):
                System.out.println("四月，春季");
                break;
            case(5):
                System.out.println("五月，春季");
                break;
            case(6):
                System.out.println("六月，夏季");
                break;
            case(7):
                System.out.println("七月，夏季");
                break;
            case(8):
                System.out.println("八月，夏季");
                break;
            case(9):
                System.out.println("九月，秋季");
                break;
            case(10):
                System.out.println("十月，秋季");
                break;
            case(11):
                System.out.println("十一月，秋季");
                break;
            case(12):
                System.out.println("十二月，冬季");
                break;
            default:
                System.out.println("请在1-12中输入！");
                break;
        }
    }
}
