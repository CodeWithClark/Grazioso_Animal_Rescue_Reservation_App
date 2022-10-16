package grazioso;

//Jordan Clark
//Date: 10-15-22
//Course ID: IT-145
//Description: Week 7 Project 2: Driver Class

//import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
 // CREATE ARRAY LIST: 1 for dogs, 1 for monkeys
 private static ArrayList<Dog> dogList = new ArrayList<Dog>();
 private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

 // DISPLAY MENU METHOD
 public static void displayMenu() {
	 System.out.println("\n");
     System.out.println("\t\t\t\tRescue Animal System Menu");
     System.out.println("[1] Intake a new dog");
     System.out.println("[2] Intake a new monkey");
     System.out.println("[3] Reserve an animal");
     System.out.println("[4] Print a list of all dogs");
     System.out.println("[5] Print a list of all monkeys");
     System.out.println("[6] Print a list of all animals that are not reserved");
     System.out.println("[q] Quit application");
     System.out.println();
     System.out.println("Enter a menu selection");
 }
 
 public static void main(String[] args) {
	 initializeDogList();
     initializeMonkeyList();
     displayMenu();
 
     // Prompt user for menu input
     System.out.println("Select from the following: ");
     
     // Create a scanner class object
     Scanner scnr = new Scanner(System.in);
     
     // User string input
     String userInput = scnr.nextLine();
     
     // While loop for menu
     while (!userInput.equalsIgnoreCase("q")) { // While not quit
    	 
    	 // I changed from char to string
     	
     	if (userInput.equals("1")) { // intakeNewDog option
     		intakeNewDog(scnr);
     		userInput = scnr.nextLine();
     	}
     	
     	else if (userInput.equals("2")) { // intakeNewMonkey option
     		intakeNewMonkey(scnr);
     		userInput = scnr.nextLine();
     	}
     	
     	else if (userInput.equals("3")) { // reserveAnimal option
     		reserveAnimal(scnr);
     		userInput = scnr.nextLine();
     	}
     	
     	else if (userInput.equals("4")) { // print a list of all dogs
     		printAnimals("4");
     		userInput = scnr.nextLine();
     	}
     	
     	else if (userInput.equals("5")) { // print a list of all monkeys
     		printAnimals("5");
     		userInput = scnr.nextLine();
     	}
     	
     	else if (userInput.equals("6")) { // print a list of all animals not reserved
     		printAnimals("6");
     		userInput = scnr.nextLine();
     	}
     	
     	else {
     		System.out.print("You're request is invalid. Please select 1 through 6, or 'q' for quit.");
     		displayMenu(); // Display menu again
     		userInput = scnr.nextLine(); // Prompt user to input again
     	}
     }
     
     if (userInput.equalsIgnoreCase("q")) {
    	 System.out.println("\n\nGood bye.");
    	 scnr.close();
    	 System.exit(0);
    }
 }
 
 // INITIALIZE DOG LIST
 public static void initializeDogList() {
	 Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
     Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
     Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in-service", true, "Canada");

     dogList.add(dog1);
     dogList.add(dog2);
     dogList.add(dog3);
 }
 
 // INITIALIZE MONKEY LIST
 public static void initializeMonkeyList() {
     Monkey monkey1 = new Monkey("Alan", "Macaque", "male", "5", "15lbs", "1.7ft", "2in", "532.8mm", "10-9-22", "United States", "in-service", true, "United States");
     Monkey monkey2 = new Monkey("LuLu", "Squirrel Monkey", "male", "7", "2lbs", "1.6ft", "16in", "12.6in", "11-11-22", "Brazil", "Phase IV", false, "Brazil");
     Monkey monkey3 = new Monkey("Sasha", "Marmoset", "female", "3", "5oz", "6in", "8in", "16cm", "12-24-22", "South Africa", "Phase V", false, "South Africa");
     
     monkeyList.add(monkey1);
     monkeyList.add(monkey2);
     monkeyList.add(monkey3);
 }
 
 // DISPLAY MONKEY SPECIES
 public static void displayMonkeySpecies() {
	 System.out.println("\tPlease select one of the following:");
	 System.out.print("\tcapuchin,");
	 System.out.print(" guenon,");
	 System.out.print(" macaque,");
	 System.out.print(" marmoset,");
	 System.out.print(" squirrel monkey,");
	 System.out.println(" tamarin");
}

 // INTAKE NEW DOG
 public static void intakeNewDog(Scanner scanner) {
	 // User input name
     System.out.println("What is the dog's name?");
     String name = scanner.nextLine();
     
     // Check dog name
     for(Dog dog: dogList) {
         if(dog.getName().equalsIgnoreCase(name)) {
        	 // Input validation
             System.out.println("\n\nThis dog is already in our system\n\n");
             displayMenu();
         }
     }
	 // User input breed
     System.out.println("What is the dog's breed?");
     String breed = scanner.nextLine();
     
	 // User input gender
     System.out.println("What is the dog's gender?");
     String gender = scanner.nextLine();
     
	 // User input age
     System.out.println("What is the dog's age?");
     String age = scanner.nextLine();
     
	 // User input weight
     System.out.println("What is the dog's weight?");
     String weight = scanner.nextLine();
     
	 // User input acquisition date
     System.out.println("What is the dog's acquisition date?");
     String acquisitionDate = scanner.nextLine();
     
	 // User input acquisition country
     System.out.println("What is the dog's acquisition country?");
     String acquisitionCountry = scanner.nextLine();
     
	 // User input training status
     System.out.println("What is the dog's training status?");
     String trainingStatus = scanner.nextLine();
     
	 // User input reserved status with boolean value
     System.out.println("Is the dog reserved? (true or false)");
     boolean reserved = scanner.nextBoolean();
     scanner.nextLine(); // continues to next line
     
	 // User input in-service country
     System.out.println("What is the dog's in Service Country?");
     String inServiceCountry = scanner.nextLine();
     
     // Uses constructor to set user input
     Dog newDog = new Dog(name,breed,gender,age,weight,acquisitionDate,acquisitionCountry,
    		 trainingStatus,reserved,inServiceCountry);
     // add to dog list
     dogList.add(newDog);
     
     // Informs user dog has been added
     System.out.println("\n" + name + " has been added to the dog list.");
     
     displayMenu();
 }

 // INTAKE NEW MONKEY
 public static void intakeNewMonkey(Scanner scanner) {
	 //User input name
	 System.out.println("What is the monkey's name?");
     String name = scanner.nextLine();
     for(Monkey monkey: monkeyList) {
    	 if(monkey.getName().equalsIgnoreCase(name)) {
    		 System.out.println("\n\nThis monkey is already in our system\n\n");
    		 displayMenu();
    		 }
    	 }
    
     // Prompt user for species, display species, validate species
     System.out.println("What is the monkey's species?");
     displayMonkeySpecies();
     String species = scanner.nextLine();
    
     // validate species
     if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && 
    		 !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && 
    		 !(species.equalsIgnoreCase("Squirrel Monkey")) && 
    		 !(species.equalsIgnoreCase("Tamarin"))) {
    	 System.out.println("\n\nThis monkey's species is not allowed\n\n");
    	 return;
     }
    
     //User input tail length
     System.out.println("What is the monkey's tail length?");
     String tailLength = scanner.nextLine();
     
     //User input height 
     System.out.println("What is the monkey's height?");
     String height = scanner.nextLine();
    
     //User input body length
     System.out.println("What is the monkey's body length?");
     String bodyLength = scanner.nextLine();
    
     //User input gender
     System.out.println("What is the monkey's gender?");
     String gender = scanner.nextLine();
    
     //User input age
     System.out.println("What is the monkey's age?");
     String age = scanner.nextLine();
    
     //User input weight
     System.out.println("What is the monkey's weight?");
     String weight = scanner.nextLine();
    
     //User input acquisition date
     System.out.println("What is the monkey's acquisition date?");
     String acquisitionDate = scanner.nextLine();
    
     //User input acquisition country
     System.out.println("What is the monkey's acquisition country?");
     String acquisitionCountry = scanner.nextLine();
    
     //User input training status
     System.out.println("What is the monkey's training status?");
     String trainingStatus = scanner.nextLine();
    
     //User input reservation status as boolean value
     System.out.println("Is the monkey reserved? (true or false)");
     boolean reserved = scanner.nextBoolean();
     scanner.nextLine(); // continues to next line
    
     //User input service country
     System.out.println("What is the monkey's in Service Country?");
     String inServiceCountry = scanner.nextLine();
    
     // Uses constructor to set user input
     Monkey newMonkey=new Monkey(name,species,tailLength,height,bodyLength,gender,age,weight,
    		                     acquisitionDate,acquisitionCountry,trainingStatus,reserved,
    		                     inServiceCountry);
     // Adds to monkey list
     monkeyList.add(newMonkey);
     
     // Informs user dog has been added
     System.out.println("\n" + name + " has been added to the monkey list.");
     
     displayMenu();
     
 }

 // RESERVE ANIMAL METHOD
 public static void reserveAnimal(Scanner scanner) {
     // User input animal type
	 System.out.println("Enter animal type: ");
     String animalType = scanner.nextLine();
     
     // If animal type is monkey
     if (animalType.equalsIgnoreCase("Monkey")) {
    	 // User input monkey location
    	 System.out.println("Enter the monkey's country of acquisiton: ");
         String country = scanner.nextLine();
         
         // Scan monkey list for a monkey in that location
         for(Monkey monkey: monkeyList) {
             if(monkey.getAcquisitionLocation().equalsIgnoreCase(country)) {
            	 // reserve monkey
                 monkey.setReserved(true);
             }
         }
      // Inform user monkey is reserved
      System.out.println("The monkeys in " + country + " are now reserved!");
      
      displayMenu();
      }
     else if (animalType.equalsIgnoreCase("Dog")) {
             System.out.println("Enter the dog's country of acquisition: ");
             String country = scanner.nextLine();
             for(Dog dog: dogList){
            	 if(dog.getAcquisitionLocation().equalsIgnoreCase(country)){
            		 dog.setReserved(true);
            	 }
             }
     // Inform user dog is reserved
     System.out.println("The dogs in " + country + " are now reserved!");
     
     displayMenu();
     }
     
     // Input Validation
     else {
         System.out.println("The animal entered is not on the list");
         displayMenu();
     }
 }

 // PRINT ANIMAL METHOD
 public static void printAnimals(String choice) {
     // Prints dog list
	 if(choice.equals("4")) {
		 // Searches for info in dog list
		 for(int i=0;i<dogList.size();i++) {
			 System.out.println("Name: " + dogList.get(i).getName()); // Prints name
			 System.out.println("Training Status: " + dogList.get(i).getTrainingStatus()); // Prints training status
			 System.out.println("In-Service Location: " + dogList.get(i).getInServiceLocation()); // Prints service location
			 System.out.println("Reserved: " + dogList.get(i).getReserved()+ "\n"); // Prints reserved status
		 }
    	 displayMenu();
     }
     
	 // Prints Monkey list
     else if(choice.equals("5")) {
    	 // Searches for info in monkey list
    	 for(int i=0; i<monkeyList.size(); i++) {
			 System.out.println("Name: " + monkeyList.get(i).getName()); // Prints name
			 System.out.println("Training Status: " + monkeyList.get(i).getTrainingStatus()); // Prints training status
			 System.out.println("In-Service Location: " + monkeyList.get(i).getInServiceLocation()); // Prints service location
			 System.out.println("Reserved: " + monkeyList.get(i).getReserved()+ "\n"); // Prints reserved status
		 }
    	 displayMenu();
     }
     
	 // Prints available dog & monkey list
     else if(choice.equals("6")) {
    	 for(int i=0;i<dogList.size();i++) {
    		 if(!dogList.get(i).getInServiceLocation().isEmpty()&&!dogList.get(i).getReserved()) {
    			 System.out.println("Name: " + dogList.get(i).getName());
    			 System.out.println("Training Status: " + dogList.get(i).getTrainingStatus());
    			 System.out.println("In-Service Location: " + dogList.get(i).getInServiceLocation());
    			 System.out.println("Reserved: " + dogList.get(i).getReserved()+ "\n");
    			 }
    		 }
    	 
    	 for(int i=0;i<monkeyList.size();i++) {
    		 if(!monkeyList.get(i).getInServiceLocation().isEmpty()&&!monkeyList.get(i).getReserved()){
    			 System.out.println("Name: " + monkeyList.get(i).getName());
    			 System.out.println("Training Status: " + monkeyList.get(i).getTrainingStatus());
    			 System.out.println("In-Service Location: " + monkeyList.get(i).getInServiceLocation());
    			 System.out.println("Reserved: " + monkeyList.get(i).getReserved()+ "\n");
    		 }
    	 }
    	 displayMenu();
     }
 }
}