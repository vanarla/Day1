import java.io.*;

public class StringRev {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method s
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to be reversed:");
		String s = br.readLine();
		String words[]=s.split(" ");
		String f="";
		for(int i=0;i<words.length;i++)
		{
			String rev="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				rev+=words[i].charAt(j);
			}
			f+=rev+" ";
		}
		System.out.println("Reversed string:\n"+f);
		
		
}
}
