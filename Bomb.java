//A PROGRAM THAT SETS A BOMB, DOES A COUNTDOWN AND THEN BLOWS.
import java.util.Scanner;
public class Bomb {

/*
set the bomb to blow at the specified time
@params int deadLine - the time to blow.
@call - it calls it self till the count down is done.
@return none
*/
public static void setBomb(int deadLine){
    if(deadLine == 0){
        System.out.print("\n BOOM!!!!\n");
        return;
    }
    else{
        setBomb(--deadLine);
        System.out.print(deadLine + " till explosion.\n");
    }
}


    public static void main(String args[]){
        int deadLine;
        Scanner in = new Scanner(System.in);
        System.out.print("Set the time the bomb will blow in seconds.\n");
        deadLine=in.nextInt();
        setBomb(deadLine);
        in.close();
    }
}