package main;
/*
 * This class is for the introduction of the game
 * 
 */


import java.util.*;
import java.util.concurrent.TimeUnit;

import floors.floorlight;


class Intro {
	static int HP = 100;
	
	public int carChance;
	public static boolean carHit;
	
	public static boolean carHit(boolean b) {
		carHit = false;
		
		return carHit;
	}
	
	
	public int carChance() { //Determines the chance of the player getting hit
		Random random = new Random();
		
		int carChance = random.nextInt(100)+1;
		
		
		return carChance;
	}
	
	public static void death() throws InterruptedException { // once the player reaches zero hp or lower this method is ran
		
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You've died");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("The journey is over");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("And so is the Game");
		System.exit(0);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException { //Main execution
		
		
		
		Intro outvar = new Intro();
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		String generalInput;
		int gameStart = 1; //Declaring that the game is running
		boolean watchUsage = true;
		String companyName = "Avidity";
		System.out.println("Welcome to ASCENSION!"); //Introduction
		TimeUnit.SECONDS.sleep(2);		
		System.out.println("Please enter your username! \n");
		
		String userName = input.nextLine(); //Declares the username of the user
		
		System.out.println("Hello, "+ userName + " would you like to play a game? \n\n");
		 
		while (gameStart == 1) {
		String playing = input.nextLine();
		
		if (playing.contains("YES")){
			
			System.out.println("Great, lets get started\n\n");
			gameStart++;
			
		}else {
			
			System.out.println("Please type YES\n\n");
			
		}
		
		
		}
		
		System.out.println("You've recently applied for a postion at Company " + companyName);
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You drive to the building of Company Bruh and park your car around the back");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You stroll to the front of the building wearing the watch they sent you in the mail");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("This watch is required to wear during all work hours and you don't want to be a naughty person");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("What would you like to do\n\n"); //Game starts
		
		while (gameStart == 2) { //Player can keep having options
		String groundOption = input.nextLine();
		
		if (groundOption.contains("WATCH") && groundOption.contains("OFF")){ 
			
			System.out.println("You don't want to be a naughty person");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("What are you going to do?\n\n");
			}else if (groundOption.contains("ITEMS")) {
			
			System.out.println(Watch.items());
			
			}else if (groundOption.contains("CAR") && groundOption.contains("STEAL")) { //if you steal a car
				
				System.out.println("You run into the middle of the street to try and steal a car");
				int carChance = random.nextInt(100) + 1;
				TimeUnit.SECONDS.sleep(2);
				
				if(carChance > 10) { //Failed in stealing the car
					
					Intro.carHit = true;
					Watch carhit = new Watch();
					HP = HP - 80;
					System.out.println(carhit.hitByCar1());
					TimeUnit.SECONDS.sleep(4);
					System.out.println(carhit.hitByCar2());
					if (HP <= 0) {
						
						death();
						
					}
					TimeUnit.SECONDS.sleep(4);
					System.out.println(carhit.hitByCar3());
					TimeUnit.SECONDS.sleep(4);
					System.out.println(carhit.hitByCar4());
					
					
				}else {
					
					System.out.println(" There are no cars on the street");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("What would you like to do?");
					
					
				}
			}else if (groundOption.contains("WATCH")) {
				
				Watch groundWatch = new Watch();
				System.out.print(groundWatch.watchFace());
		
		
		}else if (groundOption.contains("CAR")) { //if you go back to your car
			
			System.out.println("You walk back to your car");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("You see that you've left your keys in the car");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("Today is just not your day");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("You go back to the front of the comapanies building");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("What would you like to do\n\n");
			
			
	
		}else if (groundOption.contains("LOOK")){
			
			System.out.println("You look closer at the buliding");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("As you look around the block the building sits on, you don't see anyone walk the sidewalks");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("You look up and the buliding extends past the clouds");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("Nevertheless you need the money and walk back toward the front of the building");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("What would you like to do\n\n");
			
		}else if (groundOption.contains("ENTER")){ //enters the building
			
			System.out.println("You enter the building and as you turn the doorknob");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("The door falls off ");
			TimeUnit.SECONDS.sleep(4);
			int facingYou = random.nextInt(100) + 1;
			int passive1 = random.nextInt(100) + 1;
			
			if(facingYou > 50 && passive1 > 50) { // if facing you and passive is above 50 then they are passive and facing you
				
				System.out.println("A man, fairly well dressed, is facing toward you to greet you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He's sitting at what you assume to be the front desk");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He explains why the building is so ran down");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("You then realize that you were hired to be a janitor");
				floorlight.floorlight();
				
			}else if(facingYou < 50 && passive1 > 50) { //if facing you is below 50 but passive is above 50 they are not facing you but are passive
				
				System.out.println("A man, fairly well dressed, has his back facing you ");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He's sitting at what you assume to be the front desk");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He turns around to greet you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He explains why the buidling is so ran down");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("You then realize that you were hired to be a janitor");
				floorlight.floorlight();
				
			}else if (facingYou < 50 && passive1 < 50 ) {// if facing you is below 50 and passive is below 50 they are not facing you and are agressive
				
				System.out.println("A man, fairly well dressed, has his back facing you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He's standing at what you assume to be the front desk");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He turns around and you can see that his face is twisted into this disgusting knot of bacteria and mold");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He lunges at you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("Combat has started");
				Combat.Combat();
				gameStart = 3;
				imp.combatID = 1;
				
			}else if (facingYou > 50 && passive1 < 50) {// if facing you is above 50 and passive is below 50 they are facing you and are agressive
				
				System.out.println("A man, fairly well dressed, is facing toward you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He's standing at what you assume to be the front desk");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("His face is twisted into a knot of bacteria and mold");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("He lunges at you");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("Combat has started");
				Combat.Combat();
				gameStart = 3;
				imp.combatID = 1;
				
			}
		}  else {
			
			System.out.println("Can't do that");
			
		}
		}
		
		//next option after enter
		
}


}
	



