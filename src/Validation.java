
import java.io.IOException;
import java.util.Scanner;


public class Validation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String uid="Pallavi";
String pwd="P@123";
System.out.println("Enter username and password");
int flag=0;
for(int i=0;i<3;i++)
{
	String u=sc.nextLine();
	String p=sc.nextLine();
	
	if(uid.equals(u)&&pwd.equals(p))
	{
		System.out.println("Welcome "+uid);
		System.out.println("Enter again");
		flag++;
	}
}
if(flag==3)
{
	System.out.println("Welcome");
}
else
{
	System.out.println("Contact Admin");

}

sc.close();
	}

}
