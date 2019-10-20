package main;

import java.util.*;
import java.util.concurrent.TimeUnit;
public class Combat {
	
	public static boolean outsideAvailability = true;
	public static String bodyPart;
	public int decider;
	public static String quality;
	public static int damage;
	public static boolean fighting;
	public static int armor;
	
	public static boolean fighting(){
		
		boolean fighting = true;
		return fighting;
	}
	
	public static String bodyPart() {
		Random random = new Random();
		int decider = random.nextInt(6)+1; //The decider decides which body part is going to be hit
		
		
		if (decider == 1) {
			
			 bodyPart = "head";
			
		}else if (decider == 2) {
			
			 bodyPart = "Left Arm";
			
		}else if(decider == 3) {
			
			 bodyPart = "Right Arm";
			
		}else if (decider == 4) {
			
			 bodyPart = "Torso";
			
		}else if (decider == 5) {
			
			 bodyPart = "Left Leg";
			
		}else {
			
			 bodyPart = "Right Leg";
			
		}
		return bodyPart;
	}
	
	public static String quality () {
		Random random = new Random();
		int hitQuality = random.nextInt(100) + 1;
		
		if (hitQuality <= 20) {
			
			
			  quality = "misses";
			
		}else if (hitQuality > 21 && hitQuality < 40) {
			
			
			  quality = "grazes";
		}else if (hitQuality > 41 && hitQuality <90) {
			
			
			  quality = "hits";
			
		}else if(hitQuality > 91 && hitQuality <= 100){
			
			  quality = "crits";
			
		}
		
		return quality;
		}
	public static int damage() {
		
		Random random = new Random();
		
		if (quality == "grazes") {
			
			  damage = random.nextInt(4)+1;
			
		}else if (quality == "hits") {
			
			  damage = random.nextInt(6)+2;
			
		}else if (quality == "crits"){
			
			 damage = random.nextInt((6)+2)*(2);
			
		}else {
			
			damage = 0;
			
		}
		
		return damage;
		}
	public static int armor() {
		
		int armor = 30;
		
		return armor;
	}
	
	public static void Combat() throws InterruptedException{
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean correctResponse = false;
		
		System.out.println("Items: ");
		System.out.print(Watch.items());
		TimeUnit.SECONDS.sleep(2);
		while (correctResponse == false) {
		System.out.println("\nWhat are you going to do?");
		String combatResponse = input.nextLine();		 //Player declares what they want to do
		if (combatResponse.contains("PUNCH") || combatResponse.contains("HIT") || combatResponse.contains("FIGHT")) { //Checks to see what the player wants to do
			correctResponse = true;
			while (imp.fighting = true) {
		System.out.println("What are you going to use");
		String weapon = input.nextLine(); 				//Player declares the weapon they are using
			
			if(weapon.contains(Watch.inv[0]) || weapon.contains(Watch.inv[1]) && Watch.count[0] > 0) { //Checking to see if the player has any of the items that are in their inventory
				
				System.out.println("You take your " + weapon + " and try to hit the " + imp.name() + " in the " + Combat.bodyPart()); //you take your weapon and hit the imp in the bodypart
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Your "+ weapon + " "+ Combat.quality() +" the " + imp.name());
				
				System.out.print("\n\nYou deal " + Combat.damage() + " points of damage to the " + imp.name());
				imp.imp(); //calls for the imp method
				
			}else if (weapon.contains("WATCH")){
				
				correctResponse = true;
				Watch combatWatch = new Watch();
				System.out.print(combatWatch.watchFace());
			
			}else {
				
				System.out.println("You dont have that\n\n");
				
			}
			
			
		}
			
			
			
		
		
		} else if (combatResponse.contains("RUN")){
			
		Running.Running(); //calls for the running method
			
		
			
		} else {
			
			System.out.println("You can't do that\n\n");
			
		}
		}
}

}
