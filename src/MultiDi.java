import java.util.Scanner;

public class MultiDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter thenumber of rows:");
int rws=sc.nextInt();
System.out.println("Enter the number of columns:");
int col=sc.nextInt();
System.out.println("Enter the elements of array:");
int[][] md=new int[rws][col];		
		for(int i=0;i<rws;i++)
		{
			for(int j=0;j<col;j++)
			{
				md[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element to be searched:");
		int k=sc.nextInt();
		sc.close();
		for(int i=0;i<rws;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(k==md[i][j])
				{
					System.out.println("Element is found!");
				}
			}
		}
	}

}
