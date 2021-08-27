package operator;

public class assignment_operator {
	public static void main(String[] args) {
		int i=1;
		i+=++i;
		System.out.println(i);
		//"+"两边均为整型数字时，表示数字对相加；一边有字符串，代表字符的连接
		int a=5;
		String b="iloveyou";
		String c=a+b;
		System.out.println(c);
	}

}
