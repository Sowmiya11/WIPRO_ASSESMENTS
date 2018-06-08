import java.util.Scanner;
public class TwoArrayMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row,col;
       Scanner rc=new Scanner(System.in);
       System.out.println("Enter the number of row:");
       row=rc.nextInt();
       System.out.println("Enter the number of row:");
       col=rc.nextInt();
       int[] arr[] = new int[row][col];
       for(int j=0;j<row;j++)
  		{ 
  			for(int i=0;i<col;i++)
  			   arr[j][i]=rc.nextInt();
  		}	  System.out.println(arr.length); 
       if((arr.length*2)==4)
       {  System.out.println("The array is:");
 	      for(int j=0;j<row;j++)
  		  { System.out.println();
  			for(int i=0;i<col;i++)
  			System.out.print(arr[j][i]+"\t");
  	    	}	System.out.println();
 	      System.out.println("Reverse array:");
          for(int j=1;j>=0;j--)
 		   { System.out.println();
 			 for(int i=1;i>=0;i--)
 			  System.out.print(arr[j][i]+"\t");
 		   }	  
	     }
       else
	    	 System.out.println("Please enter 4 integer numbers");
       	    	  rc.close();
       	    	  }
	}
