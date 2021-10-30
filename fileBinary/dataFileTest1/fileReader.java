package CONSOLE.fileBinary.dataFileTest1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class fileReader {

    public static void main(String[] args) throws IOException{
       
    try (
         DataInputStream input = new DataInputStream( new FileInputStream("GUI/fileBinary/dataFileTest1/temp.dat")))
          {
              while (true) {
                  System.out.println(input.readUTF() + " ->  " + input.readDouble());
              }
        
    } catch(EOFException e){
        System.out.println("That is all of the data in the file.");
    }
    
    catch (IOException e) {
            System.out.println("Error while reading on the file!!");
    }

    }
}