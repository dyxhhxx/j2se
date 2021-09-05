package digit;

public class teststringbuffer {
    public static void main(String[] args) {

//        //增append删delete插insert反reverse
//        String str="one two";
//        StringBuffer sb=new StringBuffer(str);
//        sb.append(" three four");
//        System.out.println(sb);
//        sb.delete(4,10);
//        System.out.println(sb);
//        sb.insert(4," five");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        //查看长度，容量
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());

        String sumstring="";
        StringBuffer sumstringbuffer=new StringBuffer(sumstring);

        long time1,time2,time3;
        time1=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            String str=teststring1.randomString(10);
            sumstring+=str;
        }
        time2=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            String str=teststring1.randomString(10);
            sumstringbuffer.append(str);
        }
        System.currentTimeMillis();
        time3=System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(time3-time2);




    }
}
