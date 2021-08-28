//构造方法
package Class_Objects;

import Interface_and_Inheritance.Mortal;

public class Hero {
    static String name;
    float armor;
    float hp;
    int moveSpeed;

    //构造方法：方法名与类名相同（包括大小写）;没有返回类型；
    //父类中如果没有显式的无参构造方法，而有显式的有参构造方法，子类必须重写有参的构造方法（原因是：一个类本身是有默认的无参构造方法的，
    //但当我们给了显式的有参构造方法后，默认的无参构造方法就会失效，子类会先去调用父类的无参构造函数，而此时父类唯一的默认无参构造函数就会失效
    //
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

    //战斗胜利
    public static void BattleWin(){
        System.out.println("Victory!");
    }

    //战绩
    class BattleScore{
        int kill;
        int die;
        int assist;
        public void legendary(){
            if(kill>7){
                System.out.println(name+"超神");
            }
            else{
                System.out.println("尚未超神");
            }
        }
    }

    //敌方水晶
    static class EnemyCrystal{
        int hp=500;
        public void checkIfVictory(){
            if(hp==0){
                //静态内部类无法访问外部的实例属性和方法，但可以访问外部类的私有静态成员
                Hero.BattleWin();
                //此处虽然可以将name设为静态属性，但因为不同英雄name不同，这样做不符合逻辑，最好不要这样做！
//                System.out.println(name+" win this game!");
                System.out.println("Congratulations! You have won this game!");
            }
        }

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
        //非静态内部类的实例化必须建立在存在一个外部类的基础上
        BattleScore score=h1.new BattleScore();
        score.kill=9;
        score.legendary();
        //静态内部类的实例化不需要外部类的实例为基础
        EnemyCrystal EC=new Hero.EnemyCrystal();
        EC.hp-=500;
        EC.checkIfVictory();
    }
}
