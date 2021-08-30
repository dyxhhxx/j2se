package digit;

public class teststring {
    public static void main(String[] args) {

        //方法1
        String garen="盖伦";
        garen="亚瑟";
        //方法2
        String teemo=new String("提莫");
        //方法3
        char[] chararray=new char[]{'崔','斯','特'};
        String Hero=new String(chararray);
        //方法4
        String Hero1=garen+teemo;
        System.out.println(Hero+"\t"+Hero1);

        //String类是被final修饰的，无法被继承，会报错
//        static class MyString extends String{
//
//        }

        //创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
        char[] random=new char[5];
        for(int i=0;i<random.length;i++){

        }
    }
}
