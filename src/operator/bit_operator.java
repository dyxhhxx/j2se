package operator;
import java.util.Scanner;
public class bit_operator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("������һ��������");
		int a=s.nextInt();
		System.out.println("������ֵĶ�����Ϊ��"+Integer.toBinaryString(a));
		System.out.println("��������һ��������");
		int b=s.nextInt();
		System.out.println("������ֵĶ�����Ϊ��"+Integer.toBinaryString(b));
		System.out.println("���������ֵ�λ��Ϊ��"+(a|b)+"("+Integer.toBinaryString(a|b)+")");
		System.out.println("���������ֵ�λ��Ϊ��"+(a&b)+"("+Integer.toBinaryString(a&b)+")");
		//һЩ����������κ������Լ���򶼵���0���κ�����0��򶼵����Լ���
		System.out.println("���������ֵ����Ϊ��"+(a^b)+"("+Integer.toBinaryString(a^b)+")");
		System.out.println("��һ�������ֵ�ȡ��Ϊ��"+(~a)+"("+Integer.toBinaryString(~a)+")");
		System.out.println("��һ������������Ϊ��"+(a<<1)+"("+Integer.toBinaryString(a<<1)+"),��һ������������Ϊ��"+(a>>1)+"("+Integer.toBinaryString(a>>1)+")");
		System.out.println("2��16="+(2<<4));

	}

}
