package input.controler;

import java.util.Scanner;
 
public class InputControler
{
	//declaration section
	//All class data members are declred private
	
    private Scanner myInput;
    
    //Constructors go here
    
	
	public InputControler()
	{
	myInput = new Scanner(System.in);	
	}
	
	//method
	
	
	public void start()
	{
		questions();
	}
	

	public void questions()
	{
		System.out.println("hey, whats your name");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is " + input + " Cool but... ");
		System.out.println("i need your full name, ");
		String fullName = myInput.nextLine();
		System.out.println(" your full name?  " + fullName);
		System.out.println("Your age please?");
		int myAge = myInput.nextInt();
		System.out.println("wow" + " you are " + myAge + " years old!!!!");
	}
}	