package main;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Running {

	public static void Running() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("You run away dodging a claw in the process");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Where are you going");
		String runInput = input.nextLine(); //gets the location that they are running to
		
		if (runInput.contains("OUTSIDE") && Combat.outsideAvailability == true) {
			
			System.out.println("You run out onto the sidewalk");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("It doesn't seem like anyone is around");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("You start to scream for help");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("But no one comes to your aid");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("The imp is going to catch up to you");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("What are you going to do?");
			runInput = input.nextLine(); //gets the next command after they run outside
			
			if (runInput.contains("PUNCH") || runInput.contains("HIT") || runInput.contains("FIGHT")) {
				
				Combat.Combat();
				
			} else {
				
				System.out.println("You can't go there");
				
			}
			
		}
		
		
	}
	
	
}
