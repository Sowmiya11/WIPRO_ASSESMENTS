
import java.util.Scanner;

public class AddSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
Scanner as=new Scanner(System.in);
System.out.println("Enter the choice: ");
do{
    System.out.println("1.Add");
    System.out.println("2.Sub");
    int n=as.nextInt();
    switch (n) {
	case 1:
	    System.out.println("Enter two numbers: ");
	    int one=as.nextInt();
	    int two=as.nextInt();
        int add=one+two;
	    System.out.println("Addition value is "+add);
		break;
	case 2:
		 System.out.println("Enter two numbers: ");
		    int one1=as.nextInt();
		    int two1=as.nextInt();
	        int sub=one1+two1;
		    System.out.println("Addition value is "+sub);
			break;
	default:
		break;
	}
    System.out.println("If you want to continue?");
     ch=as.next().charAt(0);
}while(ch=='y'||ch=='Y');
as.close();
	}

}
