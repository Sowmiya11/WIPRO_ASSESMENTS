import java.util.Scanner;

public class LowerToUpperCase {
	public static void main(String str[]) {
		System.out.println("Enter character:");
		Scanner alp=new Scanner(System.in);
		char ch=alp.next().charAt(0);
		if(ch>='a' && ch<='z')
		{   char t1=(char) (ch-32);
			System.out.println(t1);
		}
		else if(ch>='A' && ch<='Z')
		{char t1=(char) (ch+32);
			System.out.println(t1);
		}
		else
			System.out.println("Invalid entry");
		alp.close();
	}
}
