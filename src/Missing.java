import java.util.Scanner;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int tot;
System.out.println("Enter the size of the array:");
int n=Integer.parseInt(sc.nextLine());
int a[]=new int[n];
System.out.println("Enter the elements of the array:");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
int k=a.length;
tot=((k+1)*(k+2))/2;
for(int i=0;i<k;i++) {
	tot-=a[i];
}

System.out.println("The Missing Number is:"+tot);
sc.close();

	}

}
