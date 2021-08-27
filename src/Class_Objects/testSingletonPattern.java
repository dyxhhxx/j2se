//单例模式三要素：
//①构造方法私有化；
//②静态属性指向实例
//③用public ststic返回第二步的静态属性(getInstance)
package Class_Objects;

public class testSingletonPattern {
    public static void main(String[] args) {
        SingletonPattern g1=SingletonPattern.getGiantDragon();
        SingletonPattern g2=SingletonPattern.getGiantDragon();
        SingletonPattern1 g3=SingletonPattern1.getGiantDragon();
        SingletonPattern1 g4=SingletonPattern1.getGiantDragon();
        //饿汉式
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g1==g2);
        //懒汉式
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g3==g4);
    }
}
