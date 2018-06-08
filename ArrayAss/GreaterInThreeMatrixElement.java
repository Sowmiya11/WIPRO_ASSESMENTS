import java.util.Scanner;
public class GreaterInThreeMatrixElement
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i,j,r,c;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the row size of an array:");
		r=ias.nextInt();
		System.out.println("Enter the column size of an array:");
		c=ias.nextInt();
		int[] sum[]=new int[r][c];
		System.out.println("Enter the elements:");
		for( j=0;j<r;j++)
		{    //System.out.println("Row"+j);
			for(i=0;i<c;i++)
			sum[i][j]=ias.nextInt();
		}
		System.out.println(sum.length);
		if((sum.length*2)==9)
		{
			for ( i=0;i<3;i++)
			{
				System.out.println("\n");
				for(j=0;j<3;j++)
					System.out.println("\t"+sum[j]);
			}
		}
		else
			System.out.println("Please enter 9 integer numbers");
		ias.close();
	}

}
