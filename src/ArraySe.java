import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String arr[]= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int flag=0;
System.out.println("Enter the name to be searched:");
String name=br.readLine();
for(int i=0;i<28;i++)
{
	String s=arr[i];
	if(name.equals(s))
	{
		flag++;
	}
	
}

if(flag!=0)
{
	System.out.println("It is present "+flag+" times");
}
else
{
	System.out.println("It is not present");
}


	}

}
