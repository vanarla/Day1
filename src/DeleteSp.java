import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteSp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int i,j;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Sentence");
String s=b.readLine();
String wd[]=s.split(" ");
int x=wd.length;
for(i=0;i<x;i++)
{
	if(wd[i]!=null)
	{
		for(j=i+1;j<x;j++)
		{
			if(wd[i].equals(wd[j]))
			{
				wd[j]=null;
			}
		}
	}
}
for(int k=0;k<x;k++)
{
	if(wd[k]!=null)
	{
		System.out.print(wd[k]+" ");
	}
}

	}

}
