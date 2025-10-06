
import java.util.Scanner;

public class Paint2 {
   public static void main(String[] args) throws Exception {  
   Scanner scnr = new Scanner(System.in);
   double wallHeight = 0.0;
   double wallWidth = 0.0;
   double wallArea = 0.0;
   double gallonsPaintNeeded = 0.0;
   double cansNeeded = 0.0;
   final double squareFeetPerGallons = 350.0;
   
   //to test in do-while loops
   Boolean validHeight = true;
   Boolean validWidth = true;
   // Implement a do-while loop to ensure input is valid
   // Prompt user to input wall's height
   do {
	   validHeight = true;
	   try {
		   System.out.print("Enter wall height (feet): ");
   //if entered value is not double then continue loop till user enters double
		   if (!scnr.hasNextDouble()) {
			   scnr.next();
			   continue;
			   }
		   wallHeight = scnr.nextDouble();
		   
		// if wallHeight is less than or equal to 0 then Exception occurs and user is prompted to enter correct value
   if (!(wallHeight > 0)) {
	   throw new Exception("You have entered Invalid Height");
	   }
   } catch (Exception e) {
	   System.out.println("Exception Occurred --> " + e.getMessage());
	   validHeight = false;
	   }        
	 
   }
   while (!validHeight);
   
   // Implement a do-while loop to ensure input is valid
   // Prompt user to input wall's width
   
   do {
	   validWidth = true;
	   try {
		   System.out.print("Enter wall width (feet): ");
   //if entered value is not double then continue loop till user enters double
		   if (!scnr.hasNextDouble()) {
			   scnr.next();
			   continue;
	}
		   wallWidth = scnr.nextDouble();
	// if wallWidth is less than or equal to 0 then Exception occurs and user is prompted to enter correct value
		   if (!(wallWidth > 0)) {
			   throw new Exception("You have entered Invalid Width");
			   }
		   } catch (Exception e) {
			   System.out.println("Exception Occurred --> " + e.getMessage());
			   validWidth = false;
			   }
	   }
   while (!validWidth) ;
   
   // Calculate and output wall area
   wallArea = wallHeight * wallWidth;
   System.out.println("Wall area: " + wallArea + "square feet");
   
   // Calculate and output the amount of paint (in gallons) needed to paint the wall
   gallonsPaintNeeded = wallArea / squareFeetPerGallons;
   System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
   //using Math.ceil() round off the value
   cansNeeded = Math.ceil(gallonsPaintNeeded);
   System.out.println("Cans needed: " + cansNeeded + " can(s)");
   }
} 


