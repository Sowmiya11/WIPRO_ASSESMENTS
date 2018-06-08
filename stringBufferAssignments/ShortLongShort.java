import java.util.Scanner;

public class ShortLongShort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		StringFinding sf=new StringFinding(str1,str2);
		sf.shortLong();
		sc.close();
	}

}
class StringFinding
{
	String str1;
	String str2;
	public StringFinding() 
	{		
	}
	public StringFinding(String str1,String str2) 
	{	
		this.str1=str1;
		this.str2=str2;
	}
	public void shortLong() 
	{
		if(str1.length()>str2.length())
			System.out.println(str2+str1+str2);
		else 
			if(str1.length()<str2.length())
				System.out.println(str1+str2+str1);
		else if(str1.length()==0 && str2.length()==0)
			System.out.println("NULL");
	}
}
