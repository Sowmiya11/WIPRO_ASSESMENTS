import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,i=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=sn.nextInt();
		while(n>0){
			x=n%10;
			i=i*10+x;
			n=n/10;
		}System.out.println("The reserved number is"+i);
sn.close();
	}

}
