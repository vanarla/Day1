import java.util.Scanner;

public class Sort {
	String rev(String r)
	{
		String rv="";
		for(int i=r.length()-1;i>=0;i--)
		{
			rv+=r.charAt(i);
		}
		return rv;
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
String st[]=new String[10],pd[]=new String[10];
String st2=" ";
int j=0;
Scanner p=new Scanner(System.in);
Sort sot=new Sort();
for(int i=0;i<10;i++)
{
st[i]=p.nextLine();

}
for(int i=0;i<st.length;i++)
{
	st2=sot.rev(st[i]);
	if(st[i].equals(st2))
	{
		pd[j]=st[i];
		j++;
	}
}
System.out.println("Number of palindromes are:"+j);
for(int i=0;i<j-1;i++)
{
	for(int x=0;x<j-1;x++)
	{
		if(pd[x].length()<pd[x+1].length())
		{
			String temp=pd[x+1];
			pd[x+1]=pd[x];
			pd[x]=temp;
		}
	}
}
for(int i=0;i<j;i++)
{
	System.out.println(pd[i]+" ");
}
p.close();
	}

}
