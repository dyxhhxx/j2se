package digit;

public class teststring4 {

    public static void main(String[] args) {

        //创建一个长度是100的字符串数组，使用长度是2的随机字符串填充该字符串数组，统计这个字符串数组里重复的字符串有多少种
        //创建长度是100的字符串数组，并用长度是2的随机字符串填充，并输出
        String[] strarray=new String[100];
        for(int i=0;i<strarray.length;i++){
            strarray[i]=teststring1.randomString(2);
            System.out.print(strarray[i]+" ");
            if((i+1)%25==0){
                System.out.println();
            }
        }
        //寻找重复的字符串（注意重复寻找）
        String sumstring="";
        for(int i=0;i<strarray.length;i++){
            for(int j=i+1;j<strarray.length;j++){
                if(strarray[i].equals(strarray[j])&&!sumstring.contains(strarray[i])){
                    sumstring+=strarray[i]+",";
                }
            }
        }
        //将找到的字符串打印
        if(sumstring!="") {
            String[] result = sumstring.split(",");
            System.out.println("总共有" + result.length + "种重复的字符串");
            System.out.println("分别是：");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
        else{
            System.out.println("没有重复的字符串");
        }

    }
}
