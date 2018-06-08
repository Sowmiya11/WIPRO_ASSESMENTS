import java.util.Scanner;
public class StringSeparater 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		 StringSep ss=new  StringSep(str1,str2,n);
		ss.separator();
		sc.close();
	}

}
class StringSep
{
	String str1;
	String str2;
	int n;
	public  StringSep() 
	{		
	}
	public  StringSep(String str1,String str2,int n) 
	{	
		this.str1=str1;
		this.str2=str2;
		this.n=n;
	}
	public void separator()
	{ 	
		int i;
		if(n>1)
		for(i=1;i<n;i++)		
			{
				System.out.print(str1+str2);
			}
			System.out.print(str1);
	}

}