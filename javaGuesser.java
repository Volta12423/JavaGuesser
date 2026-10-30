import java.util.Scanner;
//import random
import java.util.Random;
public class javaGuesser{
	public static void main(String args[]){
		Scanner ui = new Scanner(System.in);
		System.out.println("0) Exit\n1) Human Guesser\n2) Computer guesser");
		boolean keepGoing = true;
		while(keepGoing){
			int choice = ui.nextInt();
			if(choice == 0){
				//exit
				keepGoing = false;
			}else if(choice == 1){
				//human guesser
				playerGuesser();
			}else if(choice == 2){
				//computer guesser
				computerGuesser();
			}else{
				//everything else
				System.out.println("That was not one of the presented answers, please try again");
			}//end of if statement
		}//end of while loop
	}//end of main
	public void playerGuesser(){
		//human guesses
		Scanner ui = new Scanner(System.in);
		//generate random number
		Random rand = new Random();
		int num = rand.nextInt(100);
		boolean repeat = true;
		int guess;
		while(repeat){
			System.out.println("Please enter a number: ");
			guess = ui.nextInt();
			if(num == guess){
				repeat = false;
				System.out.println("got it!\n\nVery good!");
			}else{
			
			}//end if statement
		}//end while loop
	}
	public void computerGuesser(){
		//computer guesses
		Scanner ui = new Scanner(System.in);	
	}
}
