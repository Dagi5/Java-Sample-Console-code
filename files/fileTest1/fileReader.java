package CONSOLE.files.fileTest1;

import java.io.File;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) throws Exception {
        //open the file ;ocated in the gui/fileWriter folder with the name "names3" and type txt
        File myFile = new File("GUI/files/fileTest1/Names.txt");

        //open the scanner class to oprate on the file
        Scanner input = new Scanner(myFile);

        //decler the variables
        String firstName;
        String lastName;
        int age;
        String field;

        while(input.hasNext()){
            //put the incoming values in a variable
         firstName= input.next();
         lastName= input.next();
         age =  input.nextInt();
         field = input.next();

         //display the values

         System.out.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,field);

        }
input.close();

    }
}