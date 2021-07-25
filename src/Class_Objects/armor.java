//类的继承
package Class_Objects;

public class armor extends Item{          //继承了Item类，java中每个类只能继承一个类，但可通过接口方法实现多继承
    int level;

    public static void main(String[] args) {
        armor Bujia=new armor();
        armor Suozijia=new armor();
        Bujia.name="布甲";          //继承了Item中的属性
        Bujia.price=300;
        Bujia.level=15;
        Suozijia.name="锁子甲";
        Suozijia.price=500;
        Suozijia.level=40;
        System.out.println(Bujia.name+" "+Bujia.price+" "+Bujia.level);
        System.out.println(Suozijia.name+" "+Suozijia.price+" "+Suozijia.level);
    }
}
