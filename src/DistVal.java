import java.util.Scanner;

public class DistVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size,temp=0;
System.out.println("Enter the array size: ");
size=sc.nextInt();
System.out.println("Enter the integers of the array: ");
int integers[]=new int[size];
for(int i=0;i<size;i++)
{
	integers[i]=sc.nextInt();
}
System.out.println("Enter an integer k specifying atmost difference: ");
int k=sc.nextInt();
for(int i=0;i<size;i++)
{
	temp=integers[i];
	for(int j=i+1;j<size;j++)
	{
		if(integers[j]==temp)
		{
			if(Math.abs(j-i)<=k)
			{
				System.out.println(integers[j]+" at"+(i+1)+","+(j+1));
			}
		}
		
	}
}
		
		
		
		
		
		
		
		
	}

}
