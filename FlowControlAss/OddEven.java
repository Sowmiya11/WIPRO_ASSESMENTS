import java.util.Scanner;

public class OddEven {
public static void main(String str[]) {
	int num;
	Scanner n=new Scanner(System.in);
	System.out.println("enter the number");
	num=n.nextInt();
	if(num%2 == 0)
		System.out.println("Given number is even number");
	else
		System.out.println("Given number odd number");
	n.close();
}
}
