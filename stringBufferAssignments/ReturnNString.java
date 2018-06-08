import java.util.Scanner;
public class ReturnNString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=sc.nextLine();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		ReturnString rs=new ReturnString(name,n);
		rs.stringpatterning();
		sc.close();
	}

}
class ReturnString
{ 	
	String name;
	int n;
	public ReturnString()
	{		
	}
	public ReturnString(String name,int n)
	{	
		this.name=name;
		this.n=n;
	}
	public void stringpatterning() 
	{
		for(int i=0;i<=n-1;i++)
			System.out.print(name.substring(n-1,name.length()));
		
	}
}
