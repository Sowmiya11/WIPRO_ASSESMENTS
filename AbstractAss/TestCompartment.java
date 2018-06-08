import java.util.Random;
import java.util.Scanner;

public class TestCompartment {

	public static void main(String[] args) 
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("****COMPARTMENTS*****");
		//System.out.println("Enter the number of the compartment...");
		//int n=scan.nextInt();
		Compartment obj[]=new Compartment[10];	
		Random t=new Random();
		switch (t.nextInt(4))
		{
			case 1:
				obj[1]= new FirstClass();
				obj[1].notice();
				break;
			case 2:
				obj[2]=new General();
				obj[2].notice();
				break;
			case 3:
				obj[3]=new Ladies();
				obj[3].notice();
				break;
			case 4:
				obj[4]=new Luggage();
				obj[4].notice();
				default:
					System.out.println("invalid compartment number");
					break;
		
				
		}
		scan.close();
	}

}
abstract class Compartment
{
	public void notice() 
	{
		
	}
}
class FirstClass extends Compartment
{
	@Override
	public void notice() 
	{
		System.out.println("First class compartment....");
	}
}
class Ladies extends Compartment
{
	@Override
	public void notice() 
	{
		System.out.println("Ladies comapartment....");
	}
}
class General extends Compartment
{
	@Override
	public void notice() 
	{
		System.out.println("General compartment...");
	}
}
class Luggage extends Compartment
{
	@Override
	public void notice() 
	{
		System.out.println("Luggage compartment...");
	}
}