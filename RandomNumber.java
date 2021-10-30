//A PROGGRAM THAT FINDS A RANDOM NUMBER BETWEEN TWO BOUNDERIES
package CONSOLE;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

    public static void main(String args[]){
int min,max,length,random;
Scanner in =new Scanner(System.in);
Random rand = new Random();
        System.out.print("\n\nEnter the numbers that you want to find the random number\n");
        System.out.print("Enter the minumem number: \t");
        min=in.nextInt();
        System.out.print("\nEnter the maximun number: \t");
        max=in.nextInt();
        length=max-min+1;
        random= rand.nextInt(length) + min;
        System.out.println("\n\nenii miyni mayni mo. i pick.."+ random);
        in.close();
    }
}