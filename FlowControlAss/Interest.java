public class Interest 
{
  public static void main(String str[])
 {
	String gender=str[0];
	int age=Integer.parseInt(str[1]);
	if(gender.equals("female") && age<=58)
		System.out.println("Interest is 8.6%");
	else if(gender.equals("female")&&age<=120)
		System.out.println("Interest is 7.6%");
	else if(gender.equals("male")&&age<=60)
		System.out.println("Interest is 9.2%");
	else if(gender.equals("male")&&age<=120)
		System.out.println("Interest is 8.3%");
	else
		System.out.println("none of them matched");
 }
}
