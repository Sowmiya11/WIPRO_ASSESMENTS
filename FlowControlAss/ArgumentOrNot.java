public class ArgumentOrNot {
public static void main(String[] args)
	{
		int len=args.length;
		if(len==0)
			System.out.println("no values");
		else
			{for(int i=0;i<len;i++)
				{
				if(i==len-1)
					System.out.print(args[i]+".");
				else
				    System.out.print(args[i]+",");
	         
				}
			}	}
}