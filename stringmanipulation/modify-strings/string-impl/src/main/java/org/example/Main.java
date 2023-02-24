package org.example;
import java.util.Scanner;
import static org.example.StringManipulation.getStringLength;
import static org.example.StringManipulation.stringReverse;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the string to reverse : ");
        String input = scan.nextLine();
        stringReverse(input);
        System.out.println("Length of string: " +getStringLength(input));
    }
        
    }
