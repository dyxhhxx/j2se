//方法的重载
package Class_Objects;

   public class ADHero extends Hero{
    //下面都是attack方法，方法名相同，但参数类型不同（方法的重载-overload）
    public void attack(){
        System.out.println(name+"攻击了一名英雄");
    }
    public void attack(Hero h1){
        System.out.println(name+"攻击了英雄"+h1.name);
    }
    public void attack(Hero h1,Hero h2){
        System.out.println(name+"攻击了英雄"+h1.name+"和英雄"+h2.name);
    }
    public void attack(Hero ... heros){         //多个形参时，可以采用...的方法
        for(int i=0;i<heros.length;i++){
            System.out.println(name+"攻击了"+heros[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero mf=new ADHero();
        mf.name="厄运小姐";
        Hero h1=new Hero();
        h1.name="盖伦";
        Hero h2=new Hero();
        h2.name="提莫";
        mf.attack();
        mf.attack(h1);
        mf.attack(h1,h2);      //重载优先级：先匹配参数个数，再匹配最佳的参数类型
    }
}
