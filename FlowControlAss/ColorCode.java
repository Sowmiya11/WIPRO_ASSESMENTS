import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner cc=new Scanner(System.in);
      char ch=cc.next().charAt(0);
      switch(ch)
      {
      case 'R':
    	  System.out.println("RED");
    	  break;
      case 'O':
    	  System.out.println("ORANGE");
    	  break;
      case 'G':
    	  System.out.println("Green");
    	  break;
      case 'B':
    	  System.out.println("BLUE");
    	  break;
      case 'Y':
    	  System.out.println("YELLOW");
    	  break;
      case 'W':
    	  System.out.println("WHITE");
    	  break;
    	  default:
    		  System.out.println("invalid code");
     }
     cc.close(); 
	}
}
