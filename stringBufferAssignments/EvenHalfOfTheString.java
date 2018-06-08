
import java.util.Scanner;
public class EvenHalfOfTheString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=sc.nextLine();
		EvenString es=new EvenString(name);
		es.halfFinding();
		sc.close();
		
	}

}
class EvenString
{  
	String name;
	EvenString()
	{	
	}
	EvenString(String name)
	{	
		this.name=name;
	}
	public void halfFinding() 
	{
		int len=name.length();
		if(len%2==0)
			System.out.print(name.substring(0,(len/2)));
		else
			System.out.println("NULL");
	}
}
