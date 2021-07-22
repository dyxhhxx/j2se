package flow_control;
import java.util.Scanner;
public class if_ {
public static void main(String[] args) {
//	boolean b=true;
//	if (b) {
//		System.out.println("yes"+"\n");
//	}
//	if(b) {
//		System.out.println("yes1");
//		System.out.println("yes2");
//		System.out.println("yes3"+"\n");
//	}
//	if(b)      //���ӡ�{}���ǻ۽������һ�б��ʽ��Ϊ��if����
//		System.out.println("yes1");
//	System.out.println("yes2");
//	System.out.println("yes3"+"\n");
//	if(b);{           //";"Ҳ�ᱻ��Ϊһ�б��ʽ���൱��ifֻ������";"һ�б��ʽ
//		System.out.println("yes1");
//		System.out.println("yes2");
//		System.out.println("yes3"+"\n");
//	}
//	b=false;
//	if(b) {
//		System.out.println("no");
//	}else {
//		System.out.println("yes");
//	}
//	int a =2;
//	if(a==1) {
//		System.out.println("a=1");
//	}
//	if(a==2) {
//		System.out.println("a=2");
//	}
//	if(a==3) {
//		System.out.println("a=3");
//	}
//	int i=2;
//	if(i==1) {
//		System.out.println("i=1");
//	}
//	else if(i==2) {
//		System.out.println("i=2");
//	}
//	else if(i==3) {     //����ı��ʽ����ִ��
//		System.out.println("i=3");
//	}
//	
	
	
//		Scanner s=new Scanner(System.in);
//		System.out.println("���������(m)��");
//		float Height=s.nextFloat();
//		System.out.println("����������(kg):");
//		float Weight=s.nextFloat();
//		float BMI=Weight/(Height*Height);
//		System.out.println("��ͬѧ��BMIָ��Ϊ��"+BMI+",");
//		if(BMI<18.5) {
//			System.out.println("���ع���");
//		}
//		else if(18.5<=BMI & BMI<24) {
//			System.out.println("������������Χ");
//		}
//		else if(24<=BMI&BMI<27) {
//			System.out.println("���ع���");
//		}
//		else if(27<=BMI&BMI<30) {
//			System.out.println("��ȷ���");
//		}
//		else if(30<=BMI & BMI<35) {
//			System.out.println("�жȷ���");
//		}
//		else if(35<=BMI) {
//			System.out.println("�ضȷ���");
//		}

	
	Scanner s=new Scanner(System.in);
	System.out.println("请输入一个年份：");
	int year=s.nextInt();
	if(year%4==0 & year%100!=0) {     //也可以改为(year%4==0&&year%100!=0)||year%400==0
		System.out.println("该年是闰年");
	}
	else if(year%400==0) {
		System.out.println("该年不是闰年");
	}
	else{System.out.println("该年不是闰年");}
}
}
