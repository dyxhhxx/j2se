package digit;

import static java.lang.Character.getType;

public class teststring1 {


    //构造一个静态方法randomString以获取随机字符串
    public static String randomString(int length){
        String randomStr="";
        for(int i='0';i<='9';i++){
            char tempchar=(char)i;
            randomStr+=tempchar;
        }
        for(int i='A';i<='Z';i++){
            char tempchar=(char)i;
            randomStr+=tempchar;
        }
        for(int i='a';i<='z';i++){
            char tempchar=(char)i;
            randomStr+=tempchar;
        }
        char[] Str=new char[length];
        for(int i=0;i<length;i++){
//            Str[i]=randomStr[(int)(Math.random()*(randomStr.length()))];

        }
        return randomStr;
    }


    public static void main(String[] args) {

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


        //------------------------------------------------------------------------------------------------------------


        //练习2：创建一个长度是8的字符串数组，使用8个长度是5的随机字符串初始化这个数组。对这个数组进行排序，按照每个字符串
        //首字母排序（无视大小写）

        //先生成字符串数组，数组中每个元素随机生成一个字符串
        String StrA[]=new String[8];
        for(int i=0;i<StrA.length;i++){
            StrA[i]="";
            for(int i1=0;i1<5;i1++){
                while(true) {
                    char TemChar = (char) ((int) (Math.random() * ('z' - 'A' + 1)) + 'A');
                    if(Character.isDigit(TemChar)||Character.isLetter(TemChar)){
                        StrA[i]+=TemChar;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<StrA.length;i++){
            System.out.println(StrA[i]);
        }
        System.out.println("\n");

        //将每一个字符串转化为字符数组，以得到首字母，将首字母都转化为小写比较，并进行选择法（冒泡法）排序
        for(int i=0;i<StrA.length;i++){
            for(int i1=i+1;i1<StrA.length;i1++){
                char[] tempchar=StrA[i].toCharArray();
                char[] tempchar1=StrA[i1].toCharArray();
                if(Character.toLowerCase(tempchar[0])>Character.toLowerCase(tempchar1[0])){
                    String temp=StrA[i];
                    StrA[i]=StrA[i1];
                    StrA[i1]=temp;
                }
            }
        }
        for(int i=0;i<StrA.length;i++){
            System.out.println(StrA[i]);
        }

    }
}
