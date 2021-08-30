package digit;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class FormatedOutput {

    public static void main(String[] args) {
        //字符串拼接两种方式：
        //直接使用+连接
        String Name="盖伦";
        int kill=8;
        String title="超神";
        String Sentence0=Name+"在进行了连续的"+kill+"杀后获得了"+title+"的称号!";
        System.out.println(Sentence0);
        //使用格式化输出：%s代表字符串，%d代表数字，%n代表换行
        String Sentence1="%s在进行了连续的%d杀后获得了%s的称号!%n";  //printf输出结尾没有自带的\n,需要自己加上%n或\n
        System.out.printf(Sentence1,Name,kill,title);
        System.out.format(Sentence1,Name,kill,title);
        System.out.printf(Sentence1,"安妮",2,"double kill");

        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
        int year=2021;
        //直接打印数字
        System.out.printf("%d%n",year);
        //总长度是8，默认右对齐
        System.out.printf("%8d%n",year);
        //总长度是8，左对齐
        System.out.printf("%-8d%n",year);
        //总长度是8，不够补0
        System.out.printf("%08d%n",year);
        //千位分隔符
        System.out.printf("%,d%n",year*10000);
        //小数点位数
        System.out.printf("%.2f%n",Math.PI);
        //不同国家千位分隔符
        System.out.printf(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.UK,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.CHINA,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.GERMAN,"%,.2f%n",Math.PI*10000);

        Scanner s=new Scanner(System.in);
        System.out.println("请输入地名：");
        String Location=s.next();
        System.out.println("请输入公司类型：");
        String CompanyType=s.next();
        System.out.println("请输入公司名称：");
        String CompanyName=s.next();
        System.out.println("请输入老板名称：");
        String BossName=s.next();
        System.out.println("请输入金额：");
        String Amount=s.next();
        System.out.println("请输入产品：");
        String Product=s.next();
        System.out.println("请输入价格计量单位：");
        String Unit=s.next();
        String Sentence="%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了！我们没有办法，拿着%s抵工资！原价都是一%s多，两%s多，三%s多多%s，现在只卖二十块，统统只要二十块！%s王八蛋，你不是人！我们辛辛苦苦给你干了大半年，你不发工资，" +
                "你还我血汗钱，还我血汗钱！";
        System.out.printf(Sentence,Location,CompanyType,CompanyType,BossName,Amount,Product,Unit,Unit,Unit,Product,BossName);




    }
}
