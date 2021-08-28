package practice_Inheritance;

//Spider类继承Animal类
public class Spider extends Animal {
//父类Animal中只有显式的有参构造函数，因此子类中必须有办法将父类构造方法中所需要的参数提供

    //定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿
    public Spider(){
        super(8);
    }

    //但这样更符合编写逻辑
//    public Spider(int legs){
//        super(legs);
//        System.out.println("Spider的构造函数");
//    }

    //实现eat方法
    @Override
    public void eat(){
        System.out.println("吃虫子");
    }

}
