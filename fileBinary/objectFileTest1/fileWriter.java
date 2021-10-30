package CONSOLE.fileBinary.objectFileTest1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class fileWriter  {
    public static void main(String[] args) throws ClassNotFoundException,IOException{
        
        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("GUI/fileBinary/objectFileTest1/temp.dat",true)))) {
    output.writeUTF("James Bond");
    output.writeDouble(0.07);
    output.writeObject(new Date());

    System.out.println("data has been dumped to file seccesfully.");
} catch (IOException e) {
    System.out.println("Error while writing on the file!!");
}
    }
}