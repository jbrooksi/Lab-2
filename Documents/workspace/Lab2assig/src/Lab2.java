import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		
		String gettingFood, cookMeal, animal, sailWay;
		
		//Welcome message to the game
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to this Fun ass Game!!");
		System.out.println("");
		
		//Gettin users name from input
		System.out.print("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Welcome" + " " + name);
		
		//Would you like to play the game yes or no
		System.out.print("Would you like to play this fun ass game:  ");
		String playerChoice = scan.nextLine();
			if(playerChoice.equalsIgnoreCase("yes")){
				System.out.println("Great its time to play this fun ass Game: ");
			}else if(playerChoice.equalsIgnoreCase("no")){
				System.out.println("You are a Big Ole Fat Loser");
				scan.close();
				return;
	
			}
		
		//The beginging of the Story
			System.out.println("Your stranded in the jungle and your running out of food, what will you do next" + " " + "Do you go Fishing or Hunting");
			gettingFood = scan.next();
			
		//First set of If statements, is user gonna fish or hunting.  
		//User must choose fishing to move on
			if (gettingFood.equalsIgnoreCase("fishing")){
				System.out.println("You caught a 7 pound fish and caught enough food for days");
				System.out.print(">  ");
				}else if(gettingFood.equalsIgnoreCase("hunting")){
					System.out.println("You had your face ripped off by a bear---You Loose");
					System.out.print(">  ");
					scan.close();
					return;
				}
		System.out.println("You have to decide how to eat your fish" + "   " + "Cooked or Raw" );
		cookMeal = scan.next();
		
			if(cookMeal.equalsIgnoreCase("Cooked")){
				System.out.println("You cook a yummy meal and had food for days after");
				System.out.println("> ");
			}else if(cookMeal.equalsIgnoreCase("raw")){
				System.out.println("You die from infection HAHAHAHA--- Fool");
				System.out.println("> ");
				scan.close();
				return;    }
			
		System.out.println("You are approached by a ANGRY wolf what do you do----fight, play dead or run");
		animal = scan.next();
		
			if(animal.equalsIgnoreCase("play dead")){
				System.out.println("You played dead and the wolf left you alone");
				System.out.println("> ");
			}else if(animal.equalsIgnoreCase("run")){
				System.out.println("You ran and the wolf caught you so ur dead hahaha");
				System.out.println("> ");
				scan.close();
				return;
			}else if(animal.equalsIgnoreCase("fight")){
				System.out.println("You are foolish to fight a wolf----your dead");
				System.out.println("> ");
				scan.close();
				return;
			} 
		System.out.println("Now you make you way to the shore and have to decide to A = Build a Boat; B = Write SOS in the sand; C = Stay on the Island");
		sailWay = scan.nextLine();
		
		
			if(sailWay.equalsIgnoreCase("B")){
				System.out.println("You use a Stick to write SOS in the sand, and a Helicopter sees it and comes to rescue you");
				System.out.println("> ");
			}else if(sailWay.equalsIgnoreCase("A")){
				System.out.println("You build a boat and set sail, after 4 hours the boat sinks and YOU DIE");
				scan.close();
				return;
			}else if(sailWay.equalsIgnoreCase("C")){
				System.out.println("You stay on the island live a happy life and die and old man or women");
				scan.close();
				return;
			}
			
			
		
		
		
			
			
			
			
		
		
	}

}
