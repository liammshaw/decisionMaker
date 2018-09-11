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
		String [] choices = new String[numberOfChoices]; 
		for (int i = 0; i < choices.length; i++)
		{
			System.out.println("choice #" + (i+1));
			String inputChoice = userInput.nextLine();
			choices[i]  = inputChoice;
		}
	}
}
