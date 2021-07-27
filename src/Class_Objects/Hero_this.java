package Class_Objects;

public class Hero_this extends ADHero{

    public Hero_this(String name,float armor){
        this(name);
        System.out.println("带两个参数的构造方法");
        this.armor=armor;
    }

    public  Hero_this(String n){
        this.name=n;
    }

    public Hero_this(String name,float armor,float hp){
        this(name,armor);

        this.hp=hp;
    }

    public static void main(String[] args) {
        Hero_this Garen=new Hero_this("盖伦");
        Garen.name="盖伦";
//        Garen.setarmor(200.5f);
        System.out.println(Garen.name+" "+Garen.armor);
    }
}
