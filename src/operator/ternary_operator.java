package operator;
import java.util.Scanner;
public class ternary_operator {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("���������ڼ���");
	int day=s.nextInt();
	String a=day<6?"�����ǹ�����":"��������ĩ";
	System.out.println(a);
}
}
