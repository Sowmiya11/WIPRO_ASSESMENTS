import java.util.Scanner;

public class AsciiValueFoeGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum[]=new int[20];
		int n;
		Scanner ias=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		n=ias.nextInt();
		for(int j=0;j<n;j++)
		   {
			System.out.println("Enter the "+j+"element:");
			sum[j]=ias.nextInt();
			}System.out.println("ASCII VALUE OF GIVEN ELEMENTS:");
		for(int i=0;i<n;i++)
		{
			char ch=(char) sum[i];
			System.out.println(ch);
		}
		ias.close();
	}

}
