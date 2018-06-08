import java.util.Scanner;
public class RemoveStar
{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string:");
				String str1=sc.nextLine();
				StringBuilder sb=new StringBuilder(str1);
					int len=str1.length();
					for(int i=0;i<len;i++)
						{if(str1.charAt(i)=='*')	
						   {
							if(i==0)
							{
								System.out.println(sb.delete(1, i+1));
							    break;
							}
							else
							{
								System.out.println(sb.delete(i-1, i+2));
								break;
							}
							}
						
						}
				sc.close();
			}

}

