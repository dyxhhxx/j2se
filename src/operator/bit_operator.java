package operator;
import java.util.Scanner;
public class bit_operator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a=s.nextInt();
		System.out.println("这个数字的二进制为："+Integer.toBinaryString(a));
		System.out.println("请输入另一个整数：");
		int b=s.nextInt();
		System.out.println("这个数字的二进制为："+Integer.toBinaryString(b));
		System.out.println("这两个数字的位或为："+(a|b)+"("+Integer.toBinaryString(a|b)+")");
		System.out.println("这两个数字的位与为："+(a&b)+"("+Integer.toBinaryString(a&b)+")");
		//一些特殊情况：任何数与自己异或都等于0；任何数与0异或都等于自己。
		System.out.println("这两个数字的异或为："+(a^b)+"("+Integer.toBinaryString(a^b)+")");
		System.out.println("第一个的数字的取非为："+(~a)+"("+Integer.toBinaryString(~a)+")");
		System.out.println("第一个的数字左移为："+(a<<1)+"("+Integer.toBinaryString(a<<1)+"),第一个的数字右移为："+(a>>1)+"("+Integer.toBinaryString(a>>1)+")");
		System.out.println("2×16="+(2<<4));

	}

}
