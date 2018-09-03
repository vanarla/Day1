import java.util.Scanner;

public class SearchArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int siz=sc.nextInt();
int a[]=new int[siz];

System.out.println("Enter the numbers in the list");

for(int i=0;i<siz;i++)
{
	a[i]=sc.nextInt();
}
   System.out.println("Enter the number to be searched:");
   int x=sc.nextInt();
int flag=0,k=0;
for(k=0;k<siz;k++)
{
	if(a[k]==x)
	{
		flag=1;
		break;
	}
	else
	{
		flag=0;
	}
	
}
	
	if(flag==1)
	{
		System.out.println("Number is Found at position:"+(k+1));
	}
	else
	{
		System.out.println("Number not Found!");
	}
	
	
	
	
	sc.close();
	
	
	}

}
