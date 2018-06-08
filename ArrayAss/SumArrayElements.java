import java.util.Scanner;

public class SumArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[]=new int[20];
		int n,y=0;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		for(int j=0;j<n;j++)
		   {
			System.out.println("Enter the "+j+"element:");
			sum[j]=ias.nextInt();
			}
		for(int i=0;i<n;i++)
		{
			 y=sum[i]+y;
		}System.out.println("Sum of an elements in an array:"+y);
		ias.close();
	}
}
