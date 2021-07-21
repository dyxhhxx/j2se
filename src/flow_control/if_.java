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
//	if(b)      //不加“{}“智慧将下面的一行表达式视为由if控制
//		System.out.println("yes1");
//	System.out.println("yes2");
//	System.out.println("yes3"+"\n");
//	if(b);{           //";"也会被视为一行表达式，相当于if只控制了";"一行表达式
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
//	else if(i==3) {     //后面的表达式不会执行
//		System.out.println("i=3");
//	}
//	
	
	
//		Scanner s=new Scanner(System.in);
//		System.out.println("请输入身高(m)：");
//		float Height=s.nextFloat();
//		System.out.println("请输入体重(kg):");
//		float Weight=s.nextFloat();
//		float BMI=Weight/(Height*Height);
//		System.out.println("该同学的BMI指数为："+BMI+",");
//		if(BMI<18.5) {
//			System.out.println("体重过轻");
//		}
//		else if(18.5<=BMI & BMI<24) {
//			System.out.println("体重在正常范围");
//		}
//		else if(24<=BMI&BMI<27) {
//			System.out.println("体重过重");
//		}
//		else if(27<=BMI&BMI<30) {
//			System.out.println("轻度肥胖");
//		}
//		else if(30<=BMI & BMI<35) {
//			System.out.println("中度肥胖");
//		}
//		else if(35<=BMI) {
//			System.out.println("重度肥胖");
//		}

	
	Scanner s=new Scanner(System.in);
	System.out.println("请输入一个年份：");
	int year=s.nextInt();
	if(year%4==0 & year%100!=0) {     //可以直接(year%4==0&&year%100!=0)||year%400==0
		System.out.println("该年是闰年");
	}
	else if(year%400==0) {
		System.out.println("该年是闰年");
	}
	else{System.out.println("该年不是闰年");}
}
}
