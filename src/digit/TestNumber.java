package digit;

public class TestNumber {

    //对byte自动装箱，拆箱,基本类型转换为封装类型，封装类型转换为基本类型
    byte a=1;
    Byte A=a; //自动装箱
    byte a1=A;  //自动拆箱
//    Byte A1=new Byte(a);  //基本类型转化为封装类型
    byte a2=A.byteValue();  //封装类型转化为基本类型

    //byte与integer之间的互相装箱、拆箱
    int b0=22;
//    Integer B=A.byteValue();   不行
    int b=A;
//    Byte A1=b0;  //不行
//    byte a3=new Integer(22);  //不行

    public static void main(String[] args) {
        TestNumber bite=new TestNumber();
        //通过Byte获取byte的最大值
        System.out.println(Byte.MAX_VALUE);
        System.out.println(bite.a+" "+bite.A+" "+bite.a1+" "+bite.a2);
    }
}
