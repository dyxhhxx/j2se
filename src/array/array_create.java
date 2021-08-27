package array;
import static java.lang.Math.*;
public class array_create {
    public static void main(String[] args) {
        int a[]; //首先声明一个数组,也可以int[] a;[]表明该变量为一个数组，int表明数组中均为整数变量；
        a=new int[5];  //上面一行表达式只是声明了数组，本句创建数组；数组长度为5，指向引用a
        int b[]=new int[6];
        a[0]=1;
        a[1]=0;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println(a.length);   //a.length返回数组长度
        System.out.println(b.length);
        //创建一个表长度是5的数组，给数组的每一位赋值随机整数，并通过for循环遍历整个数组，找出最小的值
        int ran[]=new int[5];
        for(int i=0;i<5;i++){
            ran[i]=(int)(Math.random()*100);
            System.out.println(ran[i]);
        }
        int j=ran[0];
        for(int i=0;i<5;i++){
            if(ran[i]<j){
                j=ran[i];
            }
        }
        System.out.println("这个数组的最小值为:"+j);
    }
}
