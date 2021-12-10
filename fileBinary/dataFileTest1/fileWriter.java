package fileBinary.dataFileTest1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileWriter {
    
    public static void main(String[] args) throws IOException{
        
       
        try (DataOutputStream output = new DataOutputStream( new FileOutputStream("GUI/fileBinary/dataFileTest1/temp.dat",true))) {
            
     output.writeUTF("Eyob");
     output.writeDouble(22.22);

     output.writeUTF("Eyu");
     output.writeDouble(33.33);

     output.writeUTF("Jhon");
     output.writeDouble(44.44);

     output.writeUTF("Dagi");
     output.writeDouble(55.55);

     System.out.println("outputting data to the file is complete.");


        } catch (IOException e) {
            System.out.println("Error while writing on the file!!");

        }
    }
}