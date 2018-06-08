import java.util.Scanner;
public class Stringabcxyz 
{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the strings:");
				String str1=sc.nextLine();
				String str2=sc.nextLine();
				System.out.println("Enter the number:");
		int len=str1.length();
		if(str1.length()==str2.length())
		 for(int i=0;i<len;i++)
			System.out.print(str1.charAt(i)+""+str2.charAt(i));
		else
			if(str1.length()>str2.length())
			{ 
				int count=0;
				for(int i=0;i<str1.length();i++)
					if(str2.length()>count)
						{
						System.out.print(str1.charAt(i)+""+str2.charAt(i));
						count++;
						}
					else
						System.out.print(str1.charAt(i));
				}
			else
				if(str1.length()<str2.length())
				{ 
					int count=0;
					for(int i=0;i<str2.length();i++)
						if(str1.length()>count)
					
						{
							System.out.print(str1.charAt(i)+""+str2.charAt(i));
							count++;
							}
						else
							System.out.print(str2.charAt(i));
					}	
		sc.close();
			}			
		
	}

