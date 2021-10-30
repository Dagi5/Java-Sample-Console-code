package CONSOLE.files.fileTest2;

import java.io.File;
import java.io.PrintWriter;

public class fileWriter {
    public static void main(String[] args) throws Exception {
        //Create the file with the directory in the same place as the main package holder file
        File myFile = new File("GUI/fileWriterName/myFile.txt");
        //close the program if the file already exists
        if(myFile.exists()){
            System.out.println("File Already existes.");
            System.exit(0);
        }

        //write some shit on the file using a try with resourses
        try(PrintWriter output = new PrintWriter(myFile) ){
            output.println("Shit is working just fine in the try with resorses class");
        }
    }
}