import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,x=0,temp,n;
		Scanner pali=new Scanner(System.in);
	    System.out.println("Enter the number: ");
		n=pali.nextInt();
		temp=n;
		while(n>0){
			x=n%10;
			i=(i*10)+x;
			n=n/10;
		}
		if(temp==i)
		    System.out.println("Given number is an palindrome number");
		else
		    System.out.println("Given number is not a palindrome");

pali.close();

	}

}
