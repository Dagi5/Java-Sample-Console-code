package fileBinary.binaryFileTest1;

import java.io.FileInputStream;
import java.io.IOException;

public class fileReader{
    
    public static void main(String[] args) throws IOException{

        try (FileInputStream input = new FileInputStream("GUI/fileBinary/binaryFileTest1/temp.dat")) {
           
           
            int value;
        while((value = input.read()) != -1){
            System.out.println( "bitch number "+ value + " step to the front.");

        }
    }
        catch (Exception e) {
            System.out.println("Error while reading on the file!!");

        }
        
        
    }
}