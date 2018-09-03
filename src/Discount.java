import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the actual amount of the item:");
int newItem=sc.nextInt();
int discount=newItem*35/100;
int newItemPrice=newItem-discount;
System.out.println("The discounted price of the item is:"+newItemPrice);
sc.close();
	}
	

}
