package floors;

import java.util.*;
import java.util.concurrent.TimeUnit;

import main.Watch;

public class floorlight {

	public static void floorlight() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("He takes you on the tour of the offices");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You can see that there aren't many employees in the building");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("For such a tall building it seems unnecessary to have this many floors");
		
		System.out.println("The tour ends at the Janitors closet");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You gather a bottle of CLEAN COAT ROSE and a BROOM");
		TimeUnit.SECONDS.sleep(4);
		
		Watch.count[2]++;
		Watch.count[1]++;
		
		System.out.println("You step out into the officespace");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Looking around the place is a pigsty");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("You can see why they accepted you the day after you applied");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Nonetheless you get to work");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("After a few minutes you make you way to the front desk");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("It seems like the man that greeted you didn't log out of his computer");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Do you look at the computer?");
		Boolean computerDeciding = true;
		
		while (computerDeciding = true) {
		
		String computerOption = input.nextLine();
		
		if (computerOption.contains("YES") || computerOption.contains("YEAH")) {
			
			System.out.println("The computer reads: \n");
			String email = "\t\tDear Dan, \n\n\t\tWhen I said we needed to clean the place I expected more than something you picked up off the street."
										+ "\n\t\tMaybe if we were dealing with an imp or two, but this is Sathanas we're talking about. If we don't \n"
										+ "\t\tdo something about this it'll only worsen for the company. Hire a team or your front desk is going to \n"
										+ "\t\tbe out back.\n\n\t\t-Auarouse";
			
			for (int i = 0; i < email.length(); i++) {
				
				System.out.print(email.charAt(i));
				Thread.sleep(100L);
				
			}
			
			TimeUnit.SECONDS.sleep(4);
			System.out.println("\n\nYou walk away before anyone seems to notice");
			TimeUnit.SECONDS.sleep(4);
			
		}else if (computerOption.contains("NO")){
			
			System.out.println("You get on with your cleaning");
			computerDeciding = false;
			
		}else {
			
			System.out.println("You can't do that");
			
		}
		
		System.out.println("The rest of the day involves scrubbing walls, toilets, chairs, really scrubbing anything");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("The place looks marginally better than before");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("When you've done all that you could you head up the elveator to the next floor");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Thanks for playing ASCENSION .5");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Try to find other paths and options");
		System.exit(0);
		//TODO Make the floor generator method
		
	}
	}
}
