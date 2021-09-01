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
