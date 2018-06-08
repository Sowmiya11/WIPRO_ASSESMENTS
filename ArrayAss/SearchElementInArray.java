import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[]=new int[20];
		int n,y=0;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		for(int j=0;j<n;j++)
		{
			System.out.println("Enter the "+(j+1)+"element:");
			sum[j]=ias.nextInt();
		}System.out.println("Enter the element to search:");
		int ser=ias.nextInt();
		for(int i=0;i<n;i++)
			if(sum[i]==ser)
			     {System.out.println("Searched element "+ser+"is position of"+(i+1)+" in array");
			     y=1;
			     }
			
		if(y==0)
			System.out.println("-1");
		
   ias.close();
	}

}
