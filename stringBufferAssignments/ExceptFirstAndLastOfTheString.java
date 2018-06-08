import java.util.Scanner;
public class ExceptFirstAndLastOfTheString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=sc.nextLine();
		FirstAndLast es=new FirstAndLast(name);
		es.midleFinding();
		sc.close();

	}

}
class FirstAndLast
{  
	String name;
	FirstAndLast()
	{	
	}
	FirstAndLast(String name)
	{	
		this.name=name;
	}
	public void midleFinding() 
	{
		int len=name.length();
			System.out.print(name.substring(1,len-1));
	}
}