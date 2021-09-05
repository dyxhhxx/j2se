package digit;

public class teststring3 {

    //反转字符串数组
    private static String[] reverseString(String[] oristr){
        String[] relstr=new String[oristr.length];
        for(int i=0;i<relstr.length;i++){
            relstr[i]=oristr[oristr.length-i-1];
        }
        return relstr;
    }

    //将字符串数组转换为字符串（用" "连接）
    private static String exstrarray(String[] strarray){
        String result="";
        for(int i=0;i<strarray.length;i++){
            result+=strarray[i]+" ";
        }
        return(result.trim());
    }



    public static void main(String[] args) {

        //每个单词首字母都转化为大写
        //方法1
        String str="let there be light";
        String str1="";
        char[] temp=str.toCharArray();
//        for(int i=0;i<temp.length;i++){
//            char[] temp1=temp[i].toCharArray();
//            temp1[0]=Character.toUpperCase(temp1[0]);
//            temp[i]=new String(temp1);
//            str1+=temp[i]+" ";
//        }
//        System.out.println(str1.trim());
        //方法2
        temp[0]=Character.toUpperCase(temp[0]);
        for(int i=0;i<temp.length;i++){
            if (temp[i] == ' ') {
                temp[i+1]=Character.toUpperCase(temp[i+1]);
            }
        }
        System.out.println(new String(temp));

        //统计一段话中有多少以p开头的单词
        String sentence="peter piper picked a peck of pickled peppers";
        String[] temp2=sentence.split(" ");
        int sum_p=0;
        for(int i=0;i<temp2.length;i++){
            if(Character.toLowerCase(temp2[i].charAt(0))=='p'){
                sum_p+=1;
            }
        }
        System.out.println(sum_p);

        //间隔大写小写模式（吧legendary写成LeGeNdArY)
        String word="legendary";
        char[] temp3=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(i%2==0){
//                word.charAt(i)=Character.toUpperCase(word.charAt(i));
                  // 报错variable expected；因为word.charAt(int index)只能返回index处的值，不能将其改变，如果想改变还是需要取出
                temp3[i]=Character.toUpperCase(temp3[i]);
            }
        }
        System.out.println(new String(temp3));

        //把最后一个字母大写
        char[] temp4=word.toCharArray();
        temp4[temp4.length-1]=Character.toUpperCase(temp4[temp4.length-1]);
        System.out.println(new String(temp4));

        //把最后一个two单词首字母大写
        String body="two eyes, two feet, one neck, two hands";

        //构造函数
//        String[] temp5=body.split(" ");
//        String[] temp6=reverseString(temp5);
//        String body1=exstrarray(temp6);
//        String body2=body1.replaceFirst("two","Two");
//        String[] temp7=body2.split(" ");
//        String[] temp8=reverseString(temp7);
//        String body3=exstrarray(temp8);
//        System.out.println(body+"\n"+body3);

        //直接写
//        String[] temp6=new String[temp5.length];
//        String body1="";
//        for(int i=0;i<temp5.length;i++){
//            temp6[temp5.length-1-i]=temp5[i];
//        }
//        for(int i=0;i<temp6.length;i++){
//            body1+=temp6[i]+" ";
//        }
//        String body2=body1.replaceFirst("two","Two");
//        System.out.println("body:"+body);
//        System.out.println("body1:"+body1);
//        System.out.println("body2:"+body2);
//        String[] temp7=body2.split(" ");
//        String[] temp8=new String[temp5.length];
//        String body3="";
//        for(int i=0;i<temp5.length;i++){
//            temp8[temp7.length-1-i]=temp7[i];
//        }
//        for(int i=0;i<temp6.length;i++){
//            body3+=temp8[i]+" ";
//        }
//        System.out.println("body3:"+body3);

        //简化方法
        int index=body.lastIndexOf("two");
        System.out.println(index);
        char[] cs=body.toCharArray();
        cs[index]=Character.toUpperCase(cs[index]);
        String result=new String(cs);
        System.out.println(result);



    }
}
