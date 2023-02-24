package org.example;
public class StringManipulation {

    // This function is used to reverse the string given by the user.
    public static void stringReverse(String input){
        String  name = input;
        String afterreverse = "";
        char [] stringCharArray = name.toCharArray();
        for(int index = stringCharArray.length-1; index>=0;index--) {

            afterreverse = afterreverse + stringCharArray[index];
        }
        System.out.println("String after reverse: "+afterreverse);
    }
    // This function is used to get the length of string given by the user.
    public static int getStringLength(String afterreverse) {
        int lengthofString = 0;
        for(int index =0;index<afterreverse.length();index++) {
            lengthofString++;
        }
        return lengthofString;
    }
}
