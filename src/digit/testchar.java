package digit;

import java.util.Scanner;

public class testchar {
    public static void main(String[] args) {

        char a='a';
        char b='1';
        char c='牛';
//        char d='ab';   //只能放一个字符

        //char对应非封装类是Character
        Character A=a;
        System.out.println(A);
        char a1=A;
        System.out.println(a1);

        //Character常用方法
        //判断是否为字母
        System.out.println(Character.isLetter(a));
        //判断是否为数字
        System.out.println(Character.isDigit(a));
        //判断是否是空白
        System.out.println(Character.isWhitespace(a));
        //判断是否是大写
        System.out.println(Character.isUpperCase(a));
        //判断是否是小写
        System.out.println(Character.isLowerCase(a));
        //转换为大写
        System.out.println(Character.toUpperCase(a));
        //转换为小写
        System.out.println(Character.toLowerCase(a));

//        String a2='a';  //不能直接把一个字符转化为字符串
        String a3=Character.toString('a');
        System.out.println(a3);

        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");

        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");
        System.out.println("\t1");
        System.out.println("1\t1");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");

        //输入一个字符串，打印出其中的大写字母和数字
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=s.next();
        char[] CharArray=str.toCharArray();
        int length=CharArray.length;
        System.out.println(length);
        for(int i=0;i<CharArray.length;i++){
            if(Character.isUpperCase(CharArray[i])||Character.isDigit(CharArray[i])){
                System.out.print(CharArray[i]+" ");
            }
        }
    }
}
