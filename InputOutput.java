//a program that accepts input from the user and displays it
//this code asks for name specifically

import java.util.Scanner;


public class InputOutput {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("\n\nEnter your name:\n");
        String name= input.nextLine();
        System.out.print("Nice to meet you "+name+"\n");
        input.close();
    }
}