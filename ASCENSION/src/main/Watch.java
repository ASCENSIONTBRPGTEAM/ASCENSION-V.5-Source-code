package main;
import java.util.*;
import floors.floordark;

public class Watch {
		static String[] inv = {"FIST", "CLEAN COAT ROSE", "BROOM" };
		public static int[] count = {2,0,0};//Where to add more items to the game
		
		Intro hp = new Intro();
	
		private String watchFace;
		private String hitByCar1;
		private String hitByCar2;
		private String hitByCar3;
		private String hitByCar4;
		static String items;
		private static String ccRinv;
		
		Scanner input = new Scanner(System.in);
		
		public String hitByCar1() throws InterruptedException{
			
			hitByCar1 = "While you're trying to stop a car you don't see the semi that is barreling towards you ";
		
			
			return hitByCar1;
			
			
		}
		public String hitByCar2() {
			
			
			hitByCar2 = "Your HP = " + hp.HP;

			
			return hitByCar2;
		}
		
		public String hitByCar3() {
			
			hitByCar3 = "You peel yourself off of the road and get back to the front of the building";
			
			return hitByCar3;
		}
		
		public String hitByCar4() {
			
			hitByCar4 = "What would you like to do\n\n";
			
			return hitByCar4;
		}
		
		
		public static String items() {
				
			items = (count[0] + " " + inv[0] + "\n"+ count[1] + " " + inv[1] + "\n" + count[2] + " " + inv[2]);
			
			
			return items;
		}
		
		
		
		public String watchFace() {
			
			
		
			watchFace = ".'`~~~~~~~~~~~`'.\r\n" + 
						"(  HP   =   " + hp.HP + "  )\r\n" + 
						"|               |\r\n" + 
						"|  -----------  |\r\n" + 
						"|  |  Items  |  |\r\n" + 
						"'. ----------- .'\r\n" + 
						" ~-------------~ \n\n";
			
			
			
			
			return watchFace;
			
		}
		
	
}
