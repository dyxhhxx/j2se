package flow_control;
import static java.lang.Math.*;
public class practice {
    public static void main(String[] args) {
        //黄金分割点：在1-20之间寻找两个数，其除数里黄金分割点0.618最近（这两个数不能同时为偶数）
//        int finali = 1;
//        int finalj = 1;
//        double c = 1 - 0.618;
//        double a, b;
//        for (int i = 1; i <= 20; i++) {
//            for (int j = 1; j <= 20; j++) {
//                if (i % 2 != 0 || j % 2 != 0) {
//                    a = (double)i / j;
//                    if (a >= 0.618) {
//                        b =(double)i / j - 0.618;
//                    } else {
//                        b =0.618 - (double)i / j;
//                    }
//                    if (b <= c) {
//                        c = b;
//                        finali = i;
//                        finalj = j;
//                    }
//
//                }else{
//                   continue;
//                }
//            }
//        }
//
//            System.out.println("这两个数分别为：" + finali + "," + finalj + ",他们的除数为：" + (double)finali/finalj);

//        int finali=1;
//        int finalj=1;
//        for(int i=1;i<=20;i++){
//            for(int j=1;j<=20;j++){
//                if(i%2!=0||j%2!=0){
//                    if(Math.abs((float)finali/finalj-0.618)>Math.abs((float)i/j-0.618)){
//                        finali=i;
//                        finalj=j;
//                    }
//                }else{
//                    continue;
//                }
//            }
//        }
//        System.out.println("这两个数分别是:"+finali+","+finalj+"，他们的除数为："+(float)finali/finalj);

        //水仙花数：一定是3位数；每一位的立方之和为这个数本身。
        for(int i=100;i<=999;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.println(i);
            }

        //小学算术题
//        for(int a=0;a<9;a++){
//            for(int b=0;b<9;b++){
//                for(int c=1;c<14;c++){
//                    for(int d=0;d<10;d++){
//                        if(a+b==8&&a+c==14&&b+d==10&&c-d==6){
//                            System.out.println("a,b,c,d分别为"+a+" "+b+" "+c+" "+d);
//                        }
//                    }
//                }
//            }
        }
        }
}
