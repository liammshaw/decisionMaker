package decisionMaker;
import java.util.Scanner;
public class decisionMaker {

	public static void main(String[] args) 
	{
		makeDecision();
	}
	public static void makeDecision()
	{
		//take user's name
		Scanner userInputOne = new Scanner(System.in);
		System.out.println("What's your name?");
		String userName = userInputOne.nextLine();
		
		//ask for number of choices 
		Scanner userInputTwo = new Scanner(System.in);
		System.out.println("Alright " + userName + " welcome to the decision maker");
		System.out.println("How many choices do you have to choose from?");
		int numberOfChoices = userInputTwo.nextInt();
		
		//user lists choices 
		String [] choices = new String[numberOfChoices]; 
		for (int i = 0; i < choices.length; i++)
		{
			System.out.println("choice #" + (i+1));
			String inputChoice = userInputOne.nextLine();
			choices[i]  = inputChoice;
		}
		String randomChoice = choices[(int)(Math.random()*numberOfChoices)];
		System.out.println("You should pick choose " + randomChoice);
	}
}
