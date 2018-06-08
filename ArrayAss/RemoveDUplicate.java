import java.util.Scanner;

public class RemoveDUplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		int sum[]=new int[n];
		for(int j=0;j<n;j++)
		   {
			System.out.println("Enter the "+j+"element:");
			sum[j]=ias.nextInt();
			}
		
		 for(int k=0;k<n;k++)
		{
			 int x=sum[k];
			for(int i=0;i<n;i++)
			{
				if(sum[i]<0 && sum[i]==x)
					{
					System.out.print(sum[i]+"\t");
					}
				
			}
		}
			
		 
		
		ias.close();
	}

}
