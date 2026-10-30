import java.util.Scanner;
//import random
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
	public static playerGuesser(){
		Scanner ui = new Scanner(System.in);
	}
	public static computerGuesser(){
		Scanner ui = new Scanner(System.in);	
	}
}
