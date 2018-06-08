import java.util.Scanner;

public class InstrumentAbstract 
{

	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		char ch;
		Instrument indt[]=new Instrument[20];
		do
		{
		   System.out.println("1.Piano");
		   System.out.println("2.Flute");
		   System.out.println("3.Guiter");
		   System.out.println("Enter the instrument to view play notice");
		  int n=scan.nextInt();
	 switch (n)
		   {
		case 1:
			indt[0]=new Piano();
			indt[0].paly();
			break;
		case 2:
			indt[1]=new Flute();
			indt[1].paly();
			break;
		case 3:
			indt[2]=new Guiter();
			indt[2].paly();
			break;
		default:
			System.out.println("invalid instrument number");
			break;
		}
	 ch=scan.next().charAt(0);
	}
		while(ch=='y' | ch=='Y');
		
		scan.close();
	}

}
abstract class Instrument
{
	 public void paly()
	{
		
	}
}
class Piano extends Instrument
{
	@Override
	public void paly() 
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}
class Flute extends Instrument
{
	@Override
	public void paly() 
	{
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guiter extends Instrument
{
	@Override
	public void paly() 
	{
		System.out.println("Guitar is playing  tin  tin  tin ");
	}
}
