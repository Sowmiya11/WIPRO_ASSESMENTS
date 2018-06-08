import java.util.Scanner;

public class IgnoreFirstAndLastCharIfX {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string:");
			String str1=sc.nextLine();
			//str1.toLowerCase();
			if(str1.charAt(0)=='x'&&str1.charAt(str1.length()-1)=='x')
				System.out.println(str1.substring(1, str1.length()-1));
			else if(str1.charAt(0)=='x')
				System.out.println(str1.substring(1, str1.length()));
			else if(str1.charAt( str1.length()-1)=='x')
				System.out.println(str1.substring(0, str1.length()-1));
				else
					System.out.println("unmatched "+str1);
				sc.close();	
	}

}
