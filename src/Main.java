import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);

	        System.out.println("Please enter an number:");
	        int numInt = input.nextInt();
	        
	        if (numInt >=1 && numInt<=5)
	        {
	        	if(numInt%2==0)
	        		{
	        		System.out.println("The number is even");
	        		}else System.out.println("the number is odd ");
	        }else if (numInt>=6 && numInt<=15)
	        {
	        	if(numInt%3==0)
	        		{
	        		System.out.println("The number devided by 3 doesn`t have residue");
	        		}else System.out.println("The number devided by 3 have residue");
	        }else if(numInt<0)
	        {
	        	System.out.println("The number is negative");
	        }else if(numInt==0)
	        {
	        	System.out.println("The nuber is 0");
	        }else System.out.println("The number is possitive");

	       

	    	input.close();
	}

}
