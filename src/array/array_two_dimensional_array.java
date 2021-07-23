package array;

public class array_two_dimensional_array {
    public static void main(String[] args) {
        //一维数组：
        int a[]=new int[]{1,3,4,5,6};
        //二位数组
        int b[][]=new int[][]{
                {1,3,4},
                {2,5,6},
                {6,3,8}
        };
        //初始化时，必须声明二位数组中一维数组的数量(即行数)，每行中的元素个数可以之后定义，但在定义前无法访问！
        int c[][]= new int[2][];
        c[0]=new int[3];
        c[1]=new int[4];
        c[1][2]=5;

        //practice:定义一个5×5的二维数组，用随机数填充该二维数组，并找出其中最大的数字及其二维坐标
        int x[][]=new int[5][5];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j]=(int)(Math.random()*100);
                System.out.print(x[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int max=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]>max){
                    max=x[i][j];   //先找最大值再找坐标，避免最大值重复
                }
            }
        }
        //防止最大值有重复
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]==max){
                   int x_co1=i;
                   int y_co1=j;
                       System.out.println("该二维数组中的最大值为:"+max+",其坐标为:"+"("+x_co1+","+y_co1+")");
                   }
                }
            }
        }

    }

