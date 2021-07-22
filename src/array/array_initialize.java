package array;
import static java.lang.Math.*;
public class array_initialize {
    public static void main(String[] args) {
        int a[]=new int[5];  //此处只给该数组分配了内存空间，还没有赋值，会使用默认值，int类型数组默认值为0
        System.out.println(a[1]);  //默认值为0
        int b[]=new int[]{11,12,13,14,15};  //指定了数组内容，就无法指定数组长度
        int c[]={1,2,3,4,5,};
        System.out.println(b[1]);
        System.out.println(c[1]);
        //创建一个长度是5的数组，并填充随机数，之后用while或for循环反转数组
        int x[]={(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)};
        int y[]=new int[5];
        for(int i=0;i<5;i++){
            y[4-i]=x[i];
        }
        System.out.println("数组x内的元素及其顺序为:");
        for(int i=0;i<5;i++){
            System.out.println(x[i]);
        }
        System.out.println("数组y内的元素及其顺序为:");
        for(int i=0;i<5;i++){
            System.out.println(y[i]);
        }


    }
}
