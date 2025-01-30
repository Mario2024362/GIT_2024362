/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024362;

import java.util.Scanner;

/**
 *
 * @author Mario Cornejo
 */
public class GIT_2024362 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Mario - 2024362");
        
        
         try { //try for detect the errors in the code
            Scanner MYKB = new Scanner(System.in);// Make the input works
            String Name = "";//variable string for input the name

            // Continue until the name is valid
            do { 
                System.out.println("Enter Your Name");// the Question for the user
                Name = MYKB.nextLine();// input for the user
                Name = Name.trim(); // Trim remove extra spaces around the name
                
                // Check if the name contains only alphabetic characters
                if (!Name.matches("[a-zA-Z]+")) { //if Name does not contain letters
                    System.out.println("Error: Numbers, special characters o empty space are not allowed.");// if there is any error this message will be the output
                    System.out.println("Try again with just letters.");// Another message for try again
                }
                
                 // Check if the first letter is Capital
                String FirstLetter = Name.substring(0, 1); //New variable where the first letter will be choose as a capital
                if (!FirstLetter.matches("[A-Z]")) { //If  the first letter does not match with capital
                    System.out.println("First letter must be capitalized.");//output message
                }
               
               
                // Valid input, exit loop
                else {
                    break; //Break for finish that part of the code.
                }

            } while (Name.matches(Name)); // if is true the name match with the specifications of the code

            // Output if name is valid
            System.out.println("That is a nice name, " + Name); // Output Message
            System.out.println("Your name contains " + Name.length() + " letters.");//String lenght will show the number of characters in the name

        } catch (Exception e) { //If there is any error the code will stop
        }
    }   

}
