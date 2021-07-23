package array;

public class array_enhanced_for_loop {
    public static void main(String[] args) {
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
        }
        //使用增强型for循环遍历数列，并找出最大值
        int max=0;
        for(int each:a){
            if(each>max){
                max=each;
            }
            System.out.println(each);
        }
        System.out.println("\n"+max);
    }
}
