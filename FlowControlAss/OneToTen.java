public class OneToTen 
{

	public static void main(String[] args)
	{	int i=1;
		System.out.println("the numbers between one to ten");
		switch(i)
		{case 1:
		     for(i=1;i<=10;i++)
			    System.out.print(i+"\t");
		     break;
		case 0:
			    System.out.println("");
			    break;
		default:
			   System.out.println("Invalid entry");
			   break;
	}
}
}
