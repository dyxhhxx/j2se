package digit;

public class teststring2 {

    //构造一个静态方法，以生成随机字符串
    public static String randomstring(int strlength){
        String pool="";
        for(int i='0';i<='9';i++){
            pool+=(char)i;
        }
        for(int i='a';i<='z';i++){
            pool+=(char)i;
        }
        for(int i='A';i<='Z';i++){
            pool+=(char)i;
        }
        char[] randomstr=new char[strlength];
        for(int i=0;i<strlength;i++){
            randomstr[i]=pool.charAt((int)(Math.random()*pool.length()));
        }
        return(new String(randomstr));
    }

    public static void main(String[] args) {

        //生成一个长度是3的字符串，使用穷举法生成长度是3的字符串，匹配上述字符串
        String password=teststring2.randomstring(3);
//        System.out.println("密码是："+password);
        //多层for循环

//        char[] guesspassword=new char[3];
//        outloop:
//        for(int i='0';i<='z';i++){
//            for(int j='0';j<='z';j++){
//                for(int k='0';k<='z';k++){
//                    if(Character.isLetterOrDigit((char)i)&&Character.isLetterOrDigit((char)j)&&Character.isLetterOrDigit((char)k)){
//                        guesspassword[0]=(char)i;
//                        guesspassword[1]=(char)j;
//                        guesspassword[2]=(char)k;
//                        String guess=new String(guesspassword);
//                        System.out.println("尝试密码是："+guess);
//                        if(guess.equals(password)){
//                            System.out.println("密码破解成功！其为："+guess);
//                            break outloop;
//                        }
//                    }
//                    else{
//                        continue;
//                    }
//                }
//            }
//        }
//        System.out.println("密码是："+password);

        //递归方法
        char[] pwd1=new char[password.length()];
        foundpwd(password,pwd1);
        System.out.println("原密码是："+password);


    }

    public static void foundpwd(String pwd,char[] pwd1){
        foundpwd(pwd,pwd1,0);
    }

    public static void foundpwd(String pwd,char[] pwd1,int index){
        for(int i='0';i<='z';i++){
            if(Character.isLetterOrDigit((char)i)){
                char c=(char)i;
                pwd1[index]=c;
                if(index!=pwd.length()-1){
                    foundpwd(pwd,pwd1,index+1);
                }
                else{
                    String pwd11=new String(pwd1);
                    if(pwd11.equals(pwd)){
                        System.out.println("找到密码，其为："+pwd11);
                    }
                }
            }
        }
    }

}
