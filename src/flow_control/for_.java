package flow_control;
import java.util.Scanner;
public class for_ {
    public static void main(String[] args) {
        //买奴隶男人3个金币，女人2个金币，小孩1个金币，现在有50个金币，要买30人，能怎么买？
//        int male=0;
//        int female=0;
//        int kid=0;
//        while(male<=30){
//           female=0;
//            while(female<=30){
//                kid=30-male-female;
//                int price=3*male+2*female+kid;
//                if(price==50){
//                    System.out.println("男人、女人、小孩的数量分别为："+male+","+female+","+kid);
//                }
//                female++;
//            }
////            male++;
//        }

//        int count=0;
//        int male=0;
//        while(male<=10){
//            int female=0;
//            while(female<=25){
//                int kid=30-male-female;
//                if(3*male+2*female+kid==50&&male+female+kid==30){
//                    System.out.println("男人、女人、小孩的数量分别为："+male+","+female+","+kid);
//                    count++;
//                }
//                female++;
//            }
//            male++;
//        }
//        System.out.println(count);


//        int count=0;
//        for(int male=0;male<=10;male++){
//            for(int female=0;female<=25;female++){
//                for(int kid=0;kid<=30;kid++){
//                    int price=3*male+2*female+kid;
//                    int num=male+female+kid;
//                    if(price==50&&num==30){
//                        System.out.println("男人、女人、小孩的数量分别为："+male+","+female+","+kid);
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println("共"+count+"种情况");

        //乞丐要钱
        Scanner s=new Scanner(System.in);
        System.out.println("请输入天数：");
        int period=s.nextInt();
        int money=0;
        int income=1;
        for(int day=1;day<=period;day++){
            money+=income;
            System.out.println("乞丐第"+day+"天收入"+income+"元");
            income*=2;
        }
        System.out.println("乞丐在这"+period+"内，共收入"+money+"元");
    }
}
