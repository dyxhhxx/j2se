//构造方法
package Class_Objects;

import Interface_and_Inheritance.Mortal;

public class Hero {
    String name;
    float armor;
    float hp;
    int moveSpeed;

    //构造方法：方法名与类名相同（包括大小写）;没有返回类型；
    public Hero(){
        System.out.println("无参构造方法");
    }
    //无参的构造方法若不写，java会默认提供一个
    //如果提供了一个有参的构造方法,默认的无参构造方法就失效了
    public Hero(String heroname){
        System.out.println("有一个参数的构造方法");
        name=heroname;
    }
    //构造方法也可以重载
    public Hero(String heroname,float herohp){
        name=heroname;
        hp=herohp;
    }
    public void effect(){
        System.out.println("产生效果");
    }
    //利用类的多态，父类引用指向子类对象（Mortal为接口，可视为父类。类只能单继承，接口可以多继承）
    public void kill(Mortal m){
        m.die();
    }

    public static void main(String[] args) {
        //实例化一个对象时，必然调用构造方法
       Hero h=new Hero();
       Hero h1=new Hero("Garen");
       h1.name="lulu";
       Hero h2=new Hero("Teemo",500);
        System.out.println(h1.name+" "+h1);    //直接打印对象，可以输出其在内存中的虚拟地址
        System.out.println(h2.name+" "+h2.hp);
        h.effect();
    }
}
