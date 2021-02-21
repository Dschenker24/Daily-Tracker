import java.util.Scanner;
//Daniel Schenker
public class ProteinTracker {
    //This class allows users to track their protein intake and store daily totals
    private static double totalProtein;

    public static double getTotalProtein(){
        return totalProtein;
    }
    public static void setTotalProtein(double protein){
        totalProtein = protein;
    }
    public static void addProtein(double amount){
        totalProtein += amount;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Protein Tracker");
        boolean done = false;
        while(!done){
            System.out.println("What would you like to do?");
            System.out.println("1: Add protein");
            System.out.println("2: Check total protein");
            System.out.print("> ");
            String userInput = scanner.next();
            if(userInput.equals("1")){
                System.out.println("How many grams of protein would you like to add?");
                System.out.print("> ");
                double amount = scanner.nextDouble();
                addProtein(amount);
                System.out.println("You have added " + amount + " grams of protein.");
                System.out.println("Your previous total was " + (totalProtein - amount) + " grams.");
                System.out.println("Your new total is " + totalProtein + " grams.");
                System.out.println("What would you like to do?");
                System.out.println("1: Return to main menu");
                System.out.println("2: Exit");
                System.out.print("> ");
                userInput = scanner.next();
                if(userInput.equals("2")){
                    done = true;
                }
            }else if(userInput.equals("2")){
                System.out.println("Your total is " + totalProtein + " grams.");
                System.out.println("What would you like to do?");
                System.out.println("1: Return to main menu");
                System.out.println("2: Exit");
                System.out.print("> ");
                userInput = scanner.next();
                if(userInput.equals("2")){
                    done = true;
                }
            }else{
                System.out.println("Invalid choice, you can choose either '1' or '2'.");
            }
        }
        System.out.println("Thank you for using the protein tracker!");


    }

}
