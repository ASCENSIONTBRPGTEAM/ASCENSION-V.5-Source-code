package main;
import java.util.*;
import java.util.concurrent.TimeUnit;
import floors.floordark;
import enemies.GeneralEnemies;

public class imp {
	
	static int ImpHP = 12; //declares globally the hp that way we can constantly update the number
	static boolean fighting = true; //Globally set to true, that way we always know that the player is fighing an imp
	static int ImpXp = enemies.GeneralEnemies.combatXPImp; // just pulls data from the general enemy class for xp
	
	public static int armor; //what the player needs to roll in order to hit the enemy
	public static int damage; //the amount of damage done to the player
	public static int combatID; //the individual id of the monster
	public static String name; //the name of the creature
	public static int toHit; //rolls to hit the player
	public static String hit; // if their weapon missed, grazed, hit, or crit
	public static int damaged; //shows the condition of the monster
	Random random;
	
	public static int toHit() {
		Random random = new Random();
		
		int toHit = random.nextInt(100)+5;
		
		return toHit;
	}
	
	public static String hit() {
		
		if (toHit() <= Combat.armor()) {
			
			hit = "misses";
			
		} else if (toHit() >= Combat.armor() && toHit() <= 50) {
			
			hit = "grazes";
			
		} else if (toHit() >= 51 && toHit() <= 90) {
			
			hit = "hits";
			
		}else if (toHit() > 91) {
			
			hit = "crits";
			
		}
		/*
		 * if (quality == "grazes") {
			
			  damage = random.nextInt(4)+1;
			
		}else if (quality == "hits") {
			
			  damage = random.nextInt(6)+2;
			
		}else if (quality == "crits"){
			
			 damage = random.nextInt((6)+2)*(2);
			
		}else {
			
			damage = 0;
			
		}
		 */
		
		return hit;
		
	}
	
	public static boolean fighting(){
		
		boolean fighting = true;
		
		return fighting;
	}
	
	public static int armor() {
		
		int Armor = 20;
		
		return Armor;
	}
	
	public static int damage() {
		Random random = new Random();
		
		if(hit() == "misses") {
			
			damage = 0;
			
		}else {
		   damage = random.nextInt(6)+2;
		}
		return damage;
	}
	
	public static int combatID() {
		
		int combatID = GeneralEnemies.combatIDImp;
		
		return combatID;
	}
	
	public static String name() {
		String name = "Imp";
		
		return name;
	}
	
	static String condition = "alive";
	
	public static String condition(){
		
		
			if (ImpHP > 1){
				
				 condition = "alive";
				
			
		}else{
			
			 condition = "dead";
			 fighting = false;
			
		}
		
		
		
	
		return condition;
	
	}
	public static void imp() throws InterruptedException{
		
		imp imp = new imp();
		imp.damaging();
		
		if (ImpHP <= 0) {
			
			floors.floordark.explorefloordark();
			
		}
		
		System.out.println("\nThe imp takes their fist and tries to strike");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Their fist " + main.imp.hit + " you");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("They deal " + main.imp.damage +" points of damage to you\n");
		
		
	}
	public void damaging() {
		
		ImpHP -= Combat.damage();
		Intro.HP -= damage();
		
	}
}
