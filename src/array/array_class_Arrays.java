package array;
import java.util.Arrays;                 //Arraya类的用法
public class array_class_Arrays {
    public static void main(String[] args) {
        //Arrays.copeOfRange复制数组，功能和System.arraycopy很像
        int a[]=new int[]{2,4,55,6,7,1};
        int b[]=Arrays.copyOfRange(a,0,6);     //Arrays.copeOfrange(被复制数组，复制起始位置（能取到），复制终止位置（取不到））
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        //Arrays.toString转化为字符串
        System.out.println("\n"+Arrays.toString(a));
        //Arrays.sort方法排序，比选择法和冒泡法排序方便简单很多
//        Arrays.sort(a);
//        System.out.println("\n"+Arrays.toString(a));
        //Arrays.binarySearch方法搜索
        //用Arrays.binarySearch方法必须先将数组排序！;若数组中有两个相同元素，结果也不确定！
        System.out.println(Arrays.toString(a));
        System.out.println("数字7在数组a中的位置是:"+Arrays.binarySearch(a,7));    //不准确
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("数字7在数组a中的位置是:"+Arrays.binarySearch(a,7));

        //Arrays.equals判断两个数组是否相同(顺序也必须一致，即每个位置元素都需要相同）
        int c[]=new int[]{1,2,4,6,7,56};
        System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b)+"\n"+Arrays.toString(c));
        System.out.println(Arrays.equals(a,b));   //false
        System.out.println(Arrays.equals(a,c));   //false

        //Arrays.fill方法填充数组
        Arrays.fill(a,3,5,8);
        System.out.println(Arrays.toString(a));
        System.out.println("\n");

        //practice:定义一个5×8的二维数组，并用随机数填满，借助Arrays函数对二维数组进行排序
        //首先生成数组
        int x[][]=new int[5][8];
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                x[i][j]=(int)(Math.random()*100);
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println('\n');
        //排序，先将二维数组全部复制进一个一维数组，排序后再重新转化为二维数组
        int y[]=new int[40];
        for(int i=0;i<5;i++){
            System.arraycopy(x[i],0,y,i*8,8);
        }
        System.out.println("\n");
        Arrays.sort(y);
        for(int i=0;i<5;i++){
            x[i]=Arrays.copyOfRange(y,i*8,((i+1)*8-1));
        }
        for(int i=0;i<5;i++){
            System.out.println(Arrays.toString(x[i]));
        }

    }
}
