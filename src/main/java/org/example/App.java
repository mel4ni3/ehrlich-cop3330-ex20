/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double total = 0.0, finalTax= 0.0, tax = 0.0, res = 0.0;

        System.out.print("What is the order amount? ");
        total = scanner.nextDouble();
        System.out.print("What state do you live in? ");
        String State = scanner.next();

        if(State.equals("WISCONSIN") || State.equals("Wisconsin") || State.equals("wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = scanner.next();
            tax = 5.0 / 100;
            finalTax = total * tax;

            if(county.equals("eau claire") || county.equals("EAU CLAIRE") || county.equals("Eau Claire")){
                finalTax = finalTax + (total * 0.005);
            }

            else if(county.equals("Dunn") || county.equals("dunn") || county.equals("DUNN")) {
                finalTax = finalTax + (total * 0.004);
            }
            
        }
        else if (State.equals("illinois") || State.equals("Illinois") || State.equals("ILLINOIS")){
            tax = 8.0 / 100;
            finalTax = total * tax;
        }
        res = total + finalTax;
        System.out.print(String.format("The tax is $%.2f.\nThe total is $%.2f.", finalTax, res));
    }
}
