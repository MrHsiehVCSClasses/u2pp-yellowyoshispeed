package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(WordChanger.wordChanger("help",1,2,"cool",1,2)); // the extra credit, 

    System.out.print("Enter a fuel efficiency: "); // Stops code to get fuel efficiency
    double eff = Double.parseDouble(sc.nextLine());
    System.out.print("Enter a make: "); // Stops code to get car maker
    String carMake = sc.nextLine();
    System.out.print("Enter a model: "); // Stops code to get car model
    String carModel = sc.nextLine();
    Car vroom = new Car(eff,carMake,carModel);

    System.out.print("Enter amount of gas to add: ");
    double amount = Double.parseDouble(sc.nextLine()); // Stops code to get amount of gas to add 
    vroom.addGas(amount);
    System.out.print("Enter distance to drive: ");
    double distance = Double.parseDouble(sc.nextLine()); // Stops code to get how far car cam drove
    vroom.drive(distance);
    System.out.print("Your " + vroom.getMakeAndModel() + " currently has " + vroom.getGasInTank() + " gallons of gas left in the tank");
    
    sc.close();
    // YOUR CODE HERE
    
   
    
  }

  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    // Set names
    String idk1 = word1.substring(start1,end1 + 1);
    String idk2 = word2.substring(start2,end2 + 1);
    
    String combString = idk1 + idk2;

    return combString;
  }
  
  /**
   * YOUR COMMENT HERE
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return YOUR COMMENT HERE
   */

}