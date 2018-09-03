import java.util.Scanner;

public class StuAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of student 1:");
		
			int a1=Integer.parseInt(sc.next());
			int b1=Integer.parseInt(sc.next());
			int c1=Integer.parseInt(sc.next());
		System.out.println("Enter the marks of student 2:");
		
			int a2=Integer.parseInt(sc.next());
			int b2=Integer.parseInt(sc.next());
			int c2=Integer.parseInt(sc.next());
		System.out.println("Enter the marks of student 3:");
		
			int a3=Integer.parseInt(sc.next());
			int b3=Integer.parseInt(sc.next());
			int c3=Integer.parseInt(sc.next());
		int tot1=a1+b1+c1;
		int tot2=a2+b2+c2;
		int tot3=a3+b3+c3;
		int avg1=(a1+b1+c1)/3;
		int avg2=(a2+b2+c2)/3;
		int avg3=(a3+b3+c3)/3;
		int tota=a1+a2+a3;
		int totb=b1+b2+b3;
		int totc=c1+c2+c3;
		int avga=(a1+a2+a3)/3;
		int avgb=(b2+b2+b3)/3;
		int avgc=(c1+c2+c3)/3;
		System.out.println();
		System.out.println("Total marks of Student1 are:"+tot1);
		System.out.println("Average marks of Student1 are:"+avg1);
		
		System.out.println();
		System.out.println("Total marks of Student2 are:"+tot2);
		System.out.println("Average marks of Student2 are:"+avg2);
		
		System.out.println();
		System.out.println("Total marks of Student3 are:"+tot3);
		System.out.println("Average marks of Student3 are:"+avg3);
		
		System.out.println();		
		System.out.println("Total marks obtained by 3 students in Subject A are:"+tota);
		System.out.println("Total marks obtained by 3 students in Subject B are:"+totb);
		System.out.println("Total marks obtained by 3 students in Subject C are:"+totc);
		
		System.out.println();
		System.out.println("Average marks obtained by 3 students in Subject A are:"+avga);
		System.out.println("Average marks obtained by 3 students in Subject B are:"+avgb);
		System.out.println("Average marks obtained by 3 students in Subject C are:"+avgc);
		sc.close();
	}

}
