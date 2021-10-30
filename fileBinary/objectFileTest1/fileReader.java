package CONSOLE.fileBinary.objectFileTest1;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class fileReader {
    public static void main(String[] args) throws IOException,Exception {
        try (ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(
                            new FileInputStream("GUI/fileBinary/objectFileTest1/temp.dat")
                                        )
                                                            )
            ) {
            
            
                String name = input.readUTF();
                double code = input.readDouble();
                Date date = (Date)(input.readObject());
                System.out.println(" im sad to report that " + name + " a.k.a " + code + " was found dead at " + date );
        
            
        }
        catch(EOFException e){

        }
        catch(ClassNotFoundException e){
        System.out.println("Error while looking for the file!!");
        }
        
        catch (Exception e) {
            System.out.println("Error while reading on the file!!");
            }
        
    }
}