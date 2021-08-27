//单例模式，只存在一个实例(懒汉式，延迟加载)
package Class_Objects;

public class SingletonPattern1 {
    private static SingletonPattern1 GiantDragon;   //不初始化，只有调用时初始化
    private SingletonPattern1(){

    }
    public static SingletonPattern1 getGiantDragon(){
        if(GiantDragon==null){
            GiantDragon=new SingletonPattern1();
        }
        return GiantDragon;
    }
}
