package array;
import java.util.Scanner;
public class array_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入数组最小值:");
        int min=s.nextInt();
        System.out.println("请输入数组最大值:");
        int max=s.nextInt();
        //先随机生成一个数列
       int a[]=new int[5];
       for(int i=0;i<5;i++){
           a[i]=(int)(Math.random()*(max-min+1)+min);  //(Math.random(max-min+1)+min):在min和max之间取随机数
           System.out.println(a[i]);
       }
        System.out.println("\n");
        //选择法排序:每一个元素先与第一位元素比较，只要比第一位小，就放在第一位；以此类推操作第二位...
        //从小到大
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("\n");

        //冒泡法排序；比较第一位和第二位元素，将较大的元素放在后一位，直至将大的元素放到最后一位。以此类推，使第二大的元素到倒数第二位...
        //从大到小
       for(int i0=0;i0<a.length;i0++){
           for(int i=0;i<a.length-1-i0;i++){
               if(a[i]>a[i+1]){
                   int temp=a[i];
                   a[i]=temp;
                   a[i+1]=temp;
               }
           }
       }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }


    }
}
