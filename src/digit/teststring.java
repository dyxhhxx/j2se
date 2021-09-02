package digit;

import java.util.Locale;

public class teststring {
    public static void main(String[] args) {

        //生成字符串
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
//        static class MyString extends String{}


        //操纵字符串
        String sentence=" Garen，在进行了连续的8次击杀后，获得了 超神 的称号 ";
        System.out.println(sentence);
        //charAt(int index)获得指定位置的字符
        System.out.println(sentence.charAt(3));
        //toCharArray()获得对应的字符数组
        char[] cs=sentence.toCharArray();
        System.out.println(sentence.length()==cs.length);
        //substring(start,end)截取子字符串
        System.out.println(sentence.substring(2,5));
        //split根据分隔符进行分隔
        String[] sentences=sentence.split(",");
        //trim去掉首尾空格
        System.out.println(sentence.trim());
        //toLowerCase全部变成小写
        System.out.println(sentence.toLowerCase());
        //toUpperCase全部变成大写
        System.out.println(sentence.toUpperCase());
        //indexOf判断字符或者子字符串出现的位置
        System.out.println(sentence.indexOf('8'));
        System.out.println(sentence.indexOf("\n"+"超神"+"\n"));
        System.out.println(sentence.lastIndexOf('了'));
        System.out.println(sentence.indexOf(',',5));
        //contains是否包含子字符串
        System.out.println(sentence.contains("击杀"));
        //replaceAll替换所有的
        System.out.println(sentence.replaceAll("击杀","被击杀"));
        System.out.println(sentence.replace("超神","超鬼"));
        //replaceFirst只替换第一个
        System.out.println(sentence.replaceFirst(",","."));

    }
}
