//单例模式，只存在一个实例(饿汉式)
package Class_Objects;

public class SingletonPattern {
    private static SingletonPattern GiantDragon=new SingletonPattern();  //直接初始化
    private SingletonPattern(){

    }
    public static SingletonPattern getGiantDragon(){
        return GiantDragon;
    }
}
