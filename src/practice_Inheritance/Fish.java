package practice_Inheritance;

public class Fish extends Animal implements Pet{

    private String name;

    //无参构造方法
    public Fish(){
        super(0);
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
        System.out.println("吃虾");
    }

    public void play(){
        System.out.println("和乌龟玩");
    }

    public void walk(){
        System.out.println("无法行走，可用鱼鳍游泳");
    }
}
