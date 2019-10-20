// Class if for exploring the floor after you kill the imp

package floors;

import java.util.*;
import java.util.concurrent.TimeUnit;
import enemies.GeneralEnemies;
import main.Watch;

public class floordark{

	public static Boolean ccR = false;
		
	public static void explorefloordark() throws InterruptedException {
		
		Random random = new Random();
		boolean seenTheComputer;
		boolean groundFloor = true;
		Scanner input = new Scanner(System.in);
		Boolean closetDeciding = true;
		Boolean locked = false;
		
		
		System.out.println("\nYou've gained: " + GeneralEnemies.combatXPImp + " XP");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You gather your composure after the fight");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Without warning the front doors slam shut");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You look around and the floor is completely dark");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("The only thing that isn't is a small closet and the elevator");
		TimeUnit.SECONDS.sleep(4);
		
		int checkToSeeComputer = random.nextInt(100) + 1;
		
		if (checkToSeeComputer > 70) {
			
			System.out.println("You also see a computer that doesn't seem to be shut down");
			seenTheComputer = true;
			
		} else {
			
			seenTheComputer = false;
			
		}
		
		while (groundFloor = true) {
			
		System.out.println("Where are you going to go?\n\n");
		String groundDarkOption = input.nextLine();
		
		
			if(groundDarkOption.contains("CLOSET")) { //to walk over to the closet
				
				System.out.println("You walk over to the closet");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("On closer inpsection, on the outside you can see a sign that reads: \n");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("\t\t __________________");
				System.out.println("\t\t |Janitor's Closet|");
				System.out.println("\t\t ------------------\n");
				System.out.println("You get the feeling that you would have spent alot of time in there");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("What would you like to do?");
				String closetResponse = input.nextLine();
						
				if (closetResponse.contains("WALK") && closetResponse.contains("IN") && locked != true || closetResponse.contains("GO") && closetResponse.contains("INSIDE")) {  //player sees ccr
					
					System.out.println("You walk into the janitors closet");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("The shelves are lined with cleaning supplies that look to be untouched");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("A bottle of dish detergent catches your eye");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("The label reads:\n");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("\t\t CLEAN COAT: FOR ALL YOUR DISHWASHING NEEDS");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("\t\t ROSE SCENTED\n");
					System.out.println("What would you like to do\n\n");
		
					
				
					
					while(closetDeciding = true) {
						
						String closetDecision = input.nextLine();	
						
						 if (closetDecision.contains("LEAVE")){
							
							System.out.println("You walk out into the dark and dingy officespace");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("The door slams shut");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("You can hear a click and you assume that it's locked");
							closetDeciding = false;
							break;
							
							
						} else if (closetDecision.contains("TAKE") || closetDecision.contains("PICKUP")) {
							
							System.out.println("You take the detergent and give it a sniff");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("It's definitely rose scented");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("You've obtained: CLEAN COAT ROSE");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("You walk out of the closet");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("The door slams shut");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("You can hear a click and you assume that it's locked");
							closetDeciding = false;
							locked = true;
							Watch.count[1]++; 
							break;
							
						}else {
							
							System.out.println("You can't do that");
							
						}
					} 
				} else if (locked = true){ //Player tries the door but it's locked
					
					System.out.println("You try the doorknob");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("But the door doesn't budge");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("You walk back out into the dingy office space");
					
				}else {
					
					System.out.println("You can't do that");
					
				}
				
			} else if(groundDarkOption.contains("WATCH")) {
				
				Watch darkWatch = new Watch();
				System.out.println(darkWatch.watchFace());
				
			} else if (groundDarkOption.contains("COMPUTER") && seenTheComputer == true) {
				
				System.out.println("You look on the computer");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("The terminal reads: ");
				
				String darkEmail = "asy t.ac si I thaw lledik eyht het etru ugsse wlle, yutricios\n";
				
				for (int i = 0; i < darkEmail.length(); i++) {
					
					System.out.print(darkEmail.charAt(i));
					Thread.sleep(10L);
					
				}
				//TODO Call the method here
				
			} else if (groundDarkOption.contains("ELEVATOR")){
				
				System.out.println("You walk toward the elevator");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("Peering into it from the outside it looks fine");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("Do you step in?");
				String elevatorOption = input.nextLine();
				if (elevatorOption.contains("YES")){
					
					System.out.println("You step in and immediately");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("The doors slam shut");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("The buttons all have the number 1");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("Thanks for playing ASCENSION .5");
					TimeUnit.SECONDS.sleep(4);
					System.out.println("Try to find other paths and options");
					System.exit(0);
					
					//TODO call the method elevator?
					
				}else if (elevatorOption.contains("NO")){
					
					System.out.println("You walk back out into the officespace");
					
				}else{
					
					System.out.println("You can't do that");
					
				}
				
			}else if (groundDarkOption.contains("ITEMS")){
				
				System.out.println(Watch.items());
				
			}else if (groundDarkOption.contains("OUTSIDE")){
				
				System.out.println("You walk up to the front door");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("You pull the handle but the door's taut");
				TimeUnit.SECONDS.sleep(4);
				System.out.println("You feel that if you keep going you might pull somthing                                                                                                                                                                                                                      boomer");
				TimeUnit.SECONDS.sleep(4);
				
			}else {
				
				System.out.println("You can't do that");
				
			}
		} 
	}

}