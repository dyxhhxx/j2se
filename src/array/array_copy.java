package array;
import java.util.Random;
public class array_copy {
    public static void main(String[] args) {
        //复制数组语句：System.arraycopy(src,srcPos,dest,destPos,length)
        int a[]=new int[5];
        int b[]=new int[3];
        int c[]=new int[3];
        //先随机生成一个数组
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.println(a[i]);
        }
        System.out.println("\n");
        //用循环方法复制
        for(int i=0;i<b.length;i++){
            b[i]=a[i+1];
            System.out.println(b[i]);
        }
        //用System.arraycopy语句复制
        System.out.println("\n");
        System.arraycopy(a,1,c,0,3);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        //practice:首先生成两个随机长度的数组，其长度为5-10之间的随机数。再将这两个数组合并到第三个数组中。
        int x[]=new int[(int)(Math.random()*5+5)];
        int y[]=new int[(int)(Math.random()*5+5)];
        int z[]=new int[x.length+y.length];
        Random r=new Random();
        for(int i=0;i<x.length;i++){
            x[i]=r.nextInt(10);
            System.out.println(x[i]);
        }
        System.out.println("x数组的长度为:"+x.length+"\n");
        for(int i=0;i<y.length;i++){
            y[i]=r.nextInt(10);
            System.out.println(y[i]);
        }
        System.out.println("y数组的长度为:"+y.length+"\n");
        System.arraycopy(x,0,z,0,x.length);
        System.arraycopy(y,0,z,x.length,y.length);
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }
        System.out.println("z数组的长度为:"+z.length+"\n");


    }
}
