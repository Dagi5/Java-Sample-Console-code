package fileBinary.binaryFileTest1;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
      try ( FileOutputStream output= new FileOutputStream("GUI/fileBinary/binaryFileTest1/temp.dat")) {
          

        for(int i = 1; i<=10;i++){
            output.write(i);
        }
        System.out.println("outputting data to the file is complete.");

      } catch (Exception e) {
        System.out.println("Error while writing on the file!!");
      }

    }
}