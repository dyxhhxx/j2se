package flow_control;
import static java.lang.Math.*;
public class switch_break {
    public static void main(String[] args) {
        //利润计算
//        int inv=12000;
//        int money=0;
//        int i=1;
//        for(i=1;;i++){
//            money+=(money+inv)*1.2;
//            System.out.println("第"+i+"年的收入为"+money+"元");
//            if(money>=1000000)
//                break;
//        }
//        System.out.println("在第"+i+"年总收入达到"+money+"元,超过1000000元");

              //使用标签结束外部循环
//        outloo:
//        for(int i=0;i<10;i++){
//            for(int j=0;j<10;j++){
//                System.out.println(i+":"+j);
//                if(j%2==0){
//                    break outloo;
//                }
//            }
//        }

        //借助boolean变量结束外部循环
        boolean a=false;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.println(i+":"+j);
                if(j%2==0){
                    a=true;
                    break;
                }
            }
            if(a){
                break;
            }
        }
    }
}
