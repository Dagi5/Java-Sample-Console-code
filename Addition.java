//A PROGRAM THAT ADDS TWO NUMBERS AND DISPLAYS IT

import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        double fNumber,sNumber,answer;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the first number\n");
        fNumber=input.nextDouble();
        System.out.print("\nEnter the second number\n");
        sNumber= input.nextDouble();
        answer=fNumber+sNumber;
        System.out.print("\nThe answer is "+answer);
        input.close();
    }
}