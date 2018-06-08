import java.util.Scanner;

public class MaxMinInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[]=new int[20];
		int x=0,y=0,n;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		for(int j=0;j<n;j++)
		{System.out.println("Enter the "+j+"element:");
			sum[j]=ias.nextInt();
			}
		x=sum[0];
		y=sum[0];
		//System.out.println("The maximum elements are"+x);
		for(int i=0;i<n;i++)
		{
			if(x<sum[i] )
				{
				x=sum[i];
				//System.out.print("The maximum elements are"+x);
				}
			 if(y>sum[i] )
			{
			x=sum[i];
			//System.out.println("The minimum elements are"+x);
			}
		}			
		System.out.println("The minimum elements are"+y);
		System.out.print("The maximum elements are"+x);


	ias.close();
	}

}

