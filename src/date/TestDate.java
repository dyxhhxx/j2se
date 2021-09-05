package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    private static SimpleDateFormat sdff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static String format(Date time){
        return sdff.format(time);
    }

    public static void main(String[] args) {

        //当前时间
        Date d1=new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();
        //从1970年1月1日早上8点0分0秒开始，经历的毫秒数
        Date d2=new Date(5000);
        System.out.println(d2);

        //getTime得到一个long型的整数,该整数代表从初始时间开始经历的毫秒数
        Date now=new Date();
        System.out.println("当前时间："+now.toString());
        System.out.println("当前时间getTime()返回值是："+now.getTime());
        Date zero=new Date(0);
        System.out.println("以0为构造方法，得到的日期是："+zero);

        //System.currentTimeMillis()
        System.out.println(now.getTime()+"\n"+System.currentTimeMillis());


        //yyyy代表year；MM代表month；dd代表day
        //HH代表hour；mm代表minute；ss代表second；SSS代表毫秒
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date day1=new Date();
        String str1=sdf.format(day1);   //转化后是一个字符串
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出："+str1);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出："+sdf.format(day1));
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss 格式化后的输出："+sdf2.format(day1));
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出："+sdf1.format(day1));

        String str2="2021-8-31 12:30:30";
        try{
            Date day2=sdf2.parse(str2);
            System.out.printf("日期%s通过格式yyyy-MM-dd HH:mm:ss %n转化为日期对象：%s",str2,day2.toString());
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.println();

        //日历
        //采用单例模式获取日历对象
        Calendar c=Calendar.getInstance();

        //通过日历对象得到日期对象
        Date d=c.getTime();

        Date d0=new Date(0);
        c.setTime(d0);  //将日历调成初始日期

        //翻日历
        //add方法，在原日期上增加年/月/日
        //set方法，直接设置年/月/日
        //当前日期
        System.out.println("当前日期:\t"+format(c.getTime()));
        c.setTime(d);
        System.out.println("当前日期:\t"+format(c.getTime()));
        //下个月的今天
        c.add(Calendar.MONTH,1);
        System.out.println("下个月的今天：\t"+format(c.getTime()));
        //去年的今天
        c.setTime(d);
        c.add(Calendar.YEAR,-1);
        System.out.println("去年的今天：\t"+format(c.getTime()));
        //上个月的第三天
        c.setTime(d1);
        c.add(Calendar.MONTH,-1);
        c.set(Calendar.DATE,3);
        System.out.println("上个月的第三天：\t"+format(c.getTime()));
        //下个月的倒数第三天
        c.setTime(d1);
        c.add(Calendar.MONTH,2);
        c.add(Calendar.DATE,1);
        c.set(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天：\t"+format(c.getTime()));










    }
}
