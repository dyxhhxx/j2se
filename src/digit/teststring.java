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

        //练习1：创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
        char[] Sum=new char[62];
        //添加数字0-9
        for(int i1=48;i1<58;i1++){
            int Num=i1;
            char Char=(char)Num;  //ASCII码转换
            Sum[i1-48]=Char;
        }
        //添加小写字母a-z
        for(int i2=97;i2<123;i2++){
            int Num=i2;
            char Char=(char)Num;
            Sum[i2-87]=Char;
        }
        //添加大写字母A-Z
        for(int i2=65;i2<91;i2++){
            int Num=i2;
            char Char=(char)Num;
            Sum[i2-29]=Char;
        }
        //打印出字符数组Sum检查是否完整
        for(int i=0;i<62;i++){
            System.out.println(Sum[i]);
        }
        //生成随机数组
        char[] Random=new char[5];
        for(int i=0;i<5;i++){
            int ran=(int)(Math.random()*62);   //虽然Math.random()正好取到61
            Random[i]=Sum[ran];
        }
        String StringRandom=new String(Random);
        System.out.println(StringRandom);

        //简化方法1：
        char[] Char1=new char[5];
        int startnum='0';
        int endnum='z';
        for(int i=0;i<Char1.length;i++){
            //用一个while(true)的循环，将非数字或字母的字符剔除
            while(true){
                char e=(char)((int)(Math.random()*(endnum-startnum+1))+startnum);
                if(Character.isLetter(e)||Character.isDigit(e)){
                    Char1[i]=e;
                    break;
                }
            }
        }
        System.out.println(new String(Char1));

        //简化方法1(直接拼接字符串)
        String Str1=new String("");
        for(int i=0;i<5;i++){
            while(true){
                char e=(char)((int)(Math.random()*('z'-'0'+1))+'0');
                if(Character.isLetter(e)||Character.isDigit(e)){
                    Str1+=e;
                    break;
                }
            }
        }
        System.out.println(Str1);

        //简化方法2
        //先把所有可能的字符挑选并集合在一起
        String StrP="";
        for(int i='0';i<='9';i++){
            StrP+=(char)i;
        }
        for(int i='a';i<='z';i++){
            StrP+=(char)i;
        }for(int i='A';i<='Z';i++){
            StrP+=(char)i;
        }
        System.out.println(StrP);
        //从StrP中随机挑选5个字符出来
        char[] Char2=new char[5];
        for(int i=0;i<Char2.length;i++){
            Char2[i]=StrP.charAt((int)(Math.random()*StrP.length()));
        }
        System.out.println(new String(Char2));








    }
}
