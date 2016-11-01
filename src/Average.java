import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**

		 *

		 * Name: Liu Zichao

		 * Teacher: Mr.Hardman

		 * Assignment 3, Program 1

		 * Date Last Modified: 11/1/2016

		 *

		 */
		Scanner userInput = new Scanner(System.in);
		
		double Firstmark;
		double secondmark;
		double Thirdmark;
		double Fourthmark;
		double Fifthmark;
	
		double Average;
		
        System.out.println("Firstmark");
        Firstmark = userInput.nextDouble();
        
        System.out.println("secondmark");
        secondmark = userInput.nextDouble();
        
        System.out.println("Thirdmark");
        Thirdmark = userInput.nextDouble();
        
        System.out.println("Fourthmark");
        Fourthmark = userInput.nextDouble();
        
        System.out.println("Fifthmark");
        Fifthmark = userInput.nextDouble();
        
        
        Average = (Firstmark + secondmark + Thirdmark + Fourthmark + Fifthmark) /5;
        
        System.out.println(String.format("Grade 1: %10.2f", Firstmark));
        System.out.println(String.format("Grade 2: %10.2f", secondmark));
        System.out.println(String.format("Grade 3: %10.2f", Thirdmark));
        System.out.println(String.format("Grade 4: %10.2f", Fourthmark));
        System.out.println(String.format("Grade 5: %10.2f", Fifthmark));
     
        System.out.println(String.format("Average: %10.2f", Average) );
        
        userInput.close();
		
	}

}
