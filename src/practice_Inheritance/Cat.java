package practice_Inheritance;

public class Cat extends Animal implements Pet{

    //该类必须包含String属性来存宠物的名字
    String name;

    //定义一个构造器，使用String参数指定猫的名字
    //该构造器必须调用超类构造器来指明所有的猫都是四条腿
    public Cat(int legs,String name){
        super(4);
        this.name=name;
    }

    //定义一个无参构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
    public Cat(){
        this(4," ");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public void eat(){
        System.out.println("吃鱼");
    }

    public void play(){
        System.out.println("和人类玩");
    }


}
