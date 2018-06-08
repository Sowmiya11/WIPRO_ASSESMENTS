import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pri=new Scanner(System.in);
		int n=pri.nextInt();
		if(n==0||n==1)
			System.out.println("Given number"+n+" is a either Prime number or not");
		else 
	      {
			for(int i=2;i<=n;)
           {	
		       if(i%n==0)
     		   { System.out.println("Given number"+n+" is a Prime number");
     		     i++;
     		    }
     		else
     		    { 
     			System.out.println("Given number"+n+" is  not a Prime number");
     		     i++;
       		}
     }
	}	
pri.close();
	}

}
