import java.util.Scanner;

public class NCopiesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=sc.nextLine();
		CopyOfString cs=new CopyOfString(name);
		cs.copy();
		sc.close();

	}

}
class CopyOfString
{   String name;
	CopyOfString()
	{	
	}
	CopyOfString(String name)
	{	
		this.name=name;
	}
	public void copy() 
	{
		int len=name.length();
		//StringBuilder strbu=new StringBuilder();
		//StringBuilder na=strbu.append(name);
		for(int i=0;i<len;i++)
			System.out.print(name.substring(0,2));
	}
}
