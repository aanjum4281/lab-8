import java.util.Scanner;

// Amna Anjum 

public class Students {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String choice = "y";
		String studentData = "";
		int input =0; 
		
		int [] order = {1,2,3,4,5,6,7,8,9,10};
		
		String[] names = {"Abby", "Alex", "Caleb", "Cathy", "Barb", 
		                  "Bob", "Darla", "Devin", "Emily", "Emmit"};
		
		String[] food = {"Salad", "Apple", "Fried chicken", "Ice cream", "Chinese food", 
				"Hamburger", "Fries", "Soup", "Pie", "Grilled Cheese"};
		
		String[] town = {"Detroit, MI", "Los Angeles, CA", "New York City, NY", "Jersey City, NJ", 
				"Boston, MA", "Cincinnati, OH", "Atlanta, GA", 
				"Miami, FL", "San Antonio, TX", "Austin, TX"};
		
		do {
			for (int i = 0; i < names.length; i++) {
			System.out.println(order[i] + "." + names[i]);	
			}	
				try  {
			//introduction and choose a student 
			System.out.println("Welcome to our Java class."
					+ " Which student would you like to learn more about? "
					+ "(Enter a number between 1-10)");
			
			//enter number in here
		
			input = scnr.nextInt();
			
			//statement for what student they picked
					System.out.println("Student " + input + " is " + names[input] + 
							". What would you like to know about " + names[input] + 
							"? (enter hometown or favorite food)");
					} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid number, try again.");
			continue;
				}
		
		 
		//clears line aka garbage line 
		studentData = scnr.nextLine(); 
		
		boolean isValid = false;
		
		do {
			//gets data
			studentData = scnr.nextLine(); 
			if ( studentData.equalsIgnoreCase("hometown")) {
				
				//if they want to know home town
				System.out.println(names[input] + " is from " + town[input] 
						+ ". Would you like to know more? (y/n)");
				
			} else if (studentData.equalsIgnoreCase("favorite food")) {
				
				// if they want to know favorite food
				System.out.println(names[input] + " favorite food is " + food[input] 
						+ ". would you like to know more? (y/n)" );
				choice = scnr.nextLine(); 
				
				
			} else {
				System.out.println("Goodbye");
				}

			} while (!isValid);
		
		} while (choice.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for asking!");
		scnr.close();
	
		
	}

}
