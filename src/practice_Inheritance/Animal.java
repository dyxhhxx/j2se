package practice_Inheritance;

//创建Animal类，它是所有动物的抽象父类
public abstract class Animal {

    //声明一个受保护的证书类型属性legs，记录动物的腿的数目
    protected int legs;

    //定义一个受保护的构造器，用来初始化legs属性
    protected Animal(int legs){
        this.legs=legs;
        System.out.println("Animal的构造函数");
    }

    //声明具体方法walk来打印动物是如何行走的（包括腿的数目）
    public void walk(){
        System.out.println("用"+legs+"只脚爬行");
    };

    //声明抽象方法eat
    public abstract void eat();


}
