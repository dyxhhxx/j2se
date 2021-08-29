package digit;

//java.lang.Math提供了一些常用的数学运算方法，并且都是以静态方法的形式存在
public class Class_Math {

    public static void main(String[] args) {
        float f1=3.28f;
        float f2=5.5f;
        //四舍五入
        System.out.println(Math.round(f1)+" "+Math.round(f2));
        //从[0,1)之间取浮点数
        System.out.println(Math.random());
        //从[0,1)之间取整数
        System.out.println((int)(Math.random()*10));
        //开方
        System.out.println(Math.sqrt(f1));
        //次方（3的5次方）
        System.out.println(Math.pow(f1,f2));
        //π
        System.out.println(Math.PI);
        //自然常数
        System.out.println(Math.E);

        //一千万以内的素数个数
        int sum=2;
        for(int num=5;num<=10000000;num++){
            boolean scout=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    scout=false;
                    break;
                }
            }
            if(scout){
                sum++;
            }

        }
        System.out.println(sum);

    }

}
