package decisionMaker;
import java.util.Scanner;
public class decisionMaker {

	public static void main(String[] args) 
	{
		makeDecision();
	}
	public static void makeDecision()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What's your name?");
		String userName = userInput.nextLine();
		System.out.println("Alright " + userName + " welcome to the decision maker");
		System.out.println("How many choices do you have to choose from?");
		int numberOfChoices = userInput.nextInt();
		String [] choices = new String[100]; 
		for (int i = 0; i < numberOfChoices; i++)
		{
			System.out.print("next choice ?");
			choices[i]  = userInput.nextLine();
		}
	}
}
