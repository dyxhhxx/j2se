package Class_Objects;

public class initialization {

   String Name =getName("属性声明");

   public initialization(){
       Name=getName("构造方法");
   }
    {
        Name=getName("初始化块");
    }

    public static String getName(String name){
        System.out.println("初始化："+name);
        return name;
    }

    public static void main(String[] args) {
        new initialization();
    }
}
