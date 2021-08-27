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

    public Hero_this(String name,float armor,float hp,int moveSpeed){
        this(name,armor);
        System.out.println("带四个参数的构造方法");
        this.hp=hp;
        this.moveSpeed=moveSpeed;
    }

    public static void main(String[] args) {
        Hero_this Garen=new Hero_this("盖伦",200.5f,300.5f,50);   //此处在调用构造方法时，会直接寻找到父类Hero，并调用Hero（）

//        Garen.setarmor(200.5f);
        System.out.println(Garen.name+" "+Garen.armor+" "+Garen.hp+" "+Garen.moveSpeed);
    }
}
