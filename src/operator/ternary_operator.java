package operator;
import java.util.Scanner;
public class ternary_operator {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("今天是星期几？");
	int day=s.nextInt();
	String a=day<6?"该日是工作日":"该日是周末";
	System.out.println(a);
}
}
