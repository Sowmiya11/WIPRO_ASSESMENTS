abstract class  GendralBank 
{
	float savingRateOfInterest;
	float fixedRateOfInterest;
	public  float getSavingInterestRate()
	{
		return savingRateOfInterest;

	}
	public float getFixedInterestRate() 
	{
	 return fixedRateOfInterest;	
	}
}
class ICICIBank extends GendralBank
{      
		float savings=4;
		float fixed=(float) 8.5;
		@Override
		public float getFixedInterestRate()
		{
		return fixed;
		}
		@Override
		public float getSavingInterestRate()
		{
		return savings;
		}		
}
class KotMBank extends GendralBank
{
	float savings=6;
	float fixed=(float) 9;
	@Override
	public float getFixedInterestRate()
	{
	return fixed;
	}
	@Override
	public float getSavingInterestRate()
	{
	return savings;
}
}
public class Bank 
{
public static void main(String[] args)
{
	ICICIBank ic=new ICICIBank();
	System.out.println("ICICIBank object reference instantiated with ICICIBank class");
	System.out.println("savingRateOfInterest="+ic.getSavingInterestRate());
	System.out.println("fixedRateOfInterest="+ic.getFixedInterestRate());
	System.out.println("KotMBank object reference instantiated with KotMBank class");
	KotMBank kot=new KotMBank();
	System.out.println("savingRateOfInterest="+kot.getSavingInterestRate());
	System.out.println("fixedRateOfInterest="+kot.getFixedInterestRate());
	System.out.println("GeneralBank object reference instantiated with KotMBank class");
	GendralBank kotgen=kot;
	System.out.println("savingRateOfInterest="+kotgen.getSavingInterestRate());
	System.out.println("fixedRateOfInterest="+kotgen.getFixedInterestRate());
	System.out.println("GeneralBank object reference instantiated with ICICIBank class.");
	GendralBank icgen=ic;
	System.out.println("savingRateOfInterest="+icgen.getSavingInterestRate());
	System.out.println("fixedRateOfInterest="+icgen.getFixedInterestRate());
	System.out.println(") GeneralBank object reference instantiated with ICICIBank class.");	
}
}
