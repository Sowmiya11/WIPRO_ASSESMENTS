import java.util.Scanner;

public class IntArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[]=new int[20];
		int x=0,n;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		for(int j=0;j<n;j++)
		{System.out.println("Enter the "+j+"element:");
			sum[j]=ias.nextInt();
			}
for(int i=0;i<n;i++)
{ x=x+sum[i];
	}
System.out.println("sum of elements in array"+x);
ias.close();
	}
	
}
