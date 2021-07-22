package flow_control;
import java.util.Scanner;
public class while_ {
    public static void main(String[] args) {
        //while循环
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }
        //dowhie循环，与while循环区别为：先执行一次do内的表达式，之后根据while的条件判断是否执行
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<5);
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=s.nextInt();
        int b=1;
        while(a>0){
            b=b*a;
            a--;
            System.out.println(a);
            System.out.println(b+"\n");
        }
        System.out.println(b);
    }
}
