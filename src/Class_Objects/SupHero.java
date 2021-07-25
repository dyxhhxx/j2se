//方法重载的练习
package Class_Objects;

public class SupHero extends Hero{
    //practie of java's overload 方法重载的练习
    public void heal(){
        System.out.println(name+"治疗了一名英雄");
    }
    public void heal(Hero h1){
        System.out.println(name+"治疗了英雄"+h1.name);
    }
    public void heal(Hero h1,float hp){
        System.out.println(name+"治疗了英雄"+h1.name+hp+"点血量");
    }

    public static void main(String[] args) {
        SupHero lulu=new SupHero();
        lulu.name="露露";
        Hero Garen=new Hero();
        Garen.name="盖伦";
        lulu.heal();
        lulu.heal(Garen);
        lulu.heal(Garen,300.77f);
    }
}
