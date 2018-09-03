
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.print("Before Swapping:");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		Bubble b=new Bubble();
		Bubble.bubblesort(num);
		System.out.println();
		System.out.print("\nSorted Array:");
		b.printArray(num);
		
    
	}
	static void bubblesort(int[] num)
	{
		int n=num.length;
		int temp=0;
		for(int i=0;i<n-1;i++)
		
			for(int j=0;j<n-i-1;j++)
			
				if(num[j]>num[j+1])
					
				{
					temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
				}
	}
	void printArray(int num[])
	{
		int n=num.length;
		for(int i=0;i<n;++i)
			System.out.print(num[i]+" ");
	}

}
