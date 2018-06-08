import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args)
	{
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n>0)
			System.out.println("the number "+n+"is positive number");
		else if(n<0)
			System.out.println("the number "+n+"is negative number");
		else
			System.out.println("the number "+n+"is zero");
		sc.close();
	
	}

}
