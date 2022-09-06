/*
Loc Nguyen
Homework 3 Lab 1
13 March 2022
*/
package cs1400.hw3lab1;
import java.util.Scanner;
public class CS1400HW3Lab1 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean test = true;
    while(test){
        System.out.println("Please enter line of text: ");
        String text = scan.nextLine();
        if (text.equals("Done") || text.equals("done") || text.equals("d")){
            test = false;
        } else {
            for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
    } System.out.println();   
    
    
    }
    }

    }
}
           



