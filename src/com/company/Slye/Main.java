package com.company.Slye;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int userInput = promptUser();
	while(userInput >= -460){
        double celsius = convertTemp(userInput);
	    displayResult(celsius);
	    userInput = promptUser();
    }
    }

    static int promptUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit:");
        int userInput = input.nextInt();
        return userInput;
    }
    static double convertTemp(int a){
        double firstValue = a - 32;
        double secondValue = 5.0/9.0;
        double celsius = firstValue * secondValue;
        return celsius;
    }
    static void displayResult(double celsius){
        System.out.println("This is the number converted to celsius " + celsius);
    }
}
