
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 */
import java.util.Scanner;
public class Population
{
	public static void main(String[] args)
	{
		//I chose to use France as my country
		
	    int male = 0;
	    int female = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("times do you want to check the gender?: ");
	    int trials = in.nextInt();
	    
    	
    
	    while(counter <= trials)
	    {
	        randNum = Math.random();
	        
	        if(randNum < .489251666 /*Male percentage / 100 */)
	        {
	            male++;
	            System.out.print(counter);
	            System.out.print("\t"+ randNum);
	            System.out.println("\t male");
	        }
	        else
	        {
	            female++;
	            System.out.print(counter);
	            System.out.print("\t"+ randNum);
	            System.out.println("\t female");
	           }
	        counter++;      
	    }
	    
	    System.out.println();
	    System.out.println("_______________________________________");
	    System.out.println("Males = " + male);
	    System.out.println("Females = " + female);
	    System.out.println("_______________________________________");
	    System.out.println();
	    
		    
		  
	    
	    
	    
	    
	    
	    
	}
}