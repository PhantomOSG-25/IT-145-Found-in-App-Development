import java.util.Scanner;

public class Paint1 {
public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner(System.in);
        
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        

        // Testing do-while loops.
        Boolean validHeight = true;
        Boolean validWidth = true;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
           validHeight = true;
        try {
        	System.out.print("Enter wall height (feet): ");
        	
        //if the user's input value is not double then the loop will continue until it does double.
        if (!scnr.hasNextDouble()){                    
           scnr.next();
           continue;
           }
        wallHeight = scnr.nextDouble();
        // If the inputted wall height is less than or equal to zero then an exception will occur and will prompt the user to enter a correct amount.
        if (!(wallHeight > 0)){
        	throw new Exception("You have entered Invalid Height");
        	}
        } catch (Exception e) {
        	System.out.println("Exception Occurred --> " + e.getMessage());
            validHeight = false;
            }
        }
        while (!validHeight);
        
        // This implements a do-while loop to ensure the input is valid.
        // This will prompt the user to input the walls width. Prompt user to input wall's width.
        do {
        	validWidth = true;
        	try {
        		System.out.print("Enter wall width (feet): ");
        		
        //If the user's input value is not double then the loop will continue until it does double.
        	if (!scnr.hasNextDouble()) {
        		scnr.next();
        		continue;
        		}
        	wallWidth = scnr.nextDouble();
        	
        // if  the inputted wall width is less than or equal to 0 then an exception will occur and will prompt the user to enter a correct amount.
        	if (!(wallWidth > 0)) {
        		throw new Exception("You have entered Invalid Width");
            }
        }   catch (Exception e) {
        		System.out.println("Exception Occurred --> " + e.getMessage());
        		validWidth = false;
        		}
        	}
            while (!validWidth) ;
        
        // This will calculate the wall area and output it.
            wallArea = wallHeight * wallWidth;
            System.out.println("Wall area: " + wallArea + " square feet");
            gallonsPaintNeeded = wallArea / squareFeetPerGallons;
            System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
             }
   }
 
