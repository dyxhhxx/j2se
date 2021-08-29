package digit;

//字符串与数字之间的相互转换
public class Conversion {
    public static void main(String[] args) {

        //数字转字符串
        int num=5;
        //方法1:调用String类的静态方法valueOf
        String str=String.valueOf(num);
        //方法2：先把基本类型装箱为对象，再调用对象的toString方法
        Integer Num=num;
        String Str=Num.toString();
        System.out.println(num+Num);  //10
        System.out.println(str+Str);  //55
        //浮点数3.14转换为字符串
        float i=3.14f;
        String j=String.valueOf(i);
        Float I1=i;
        String J=I1.toString();
        System.out.println(j+" "+J);


        //字符串转数字
        //调用Integer的静态方法parseInt
        String str1="9999";
        int num1=Integer.parseInt(str1);
        System.out.println(num1);
        //字符串3.14转化为浮点数
        float i2=Float.parseFloat(j);
        System.out.println(i2);
        //字符串中有非数字,用Float的parseFloat静态方法会报错
//        String str0="3.1a4";
//        float i0=Float.parseFloat(str0);
//        System.out.println(i0);
    }
}
