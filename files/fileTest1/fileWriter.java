package files.fileTest1;

import java.io.File;
import java.io.PrintWriter;

public class fileWriter{
    public static void main(String[] args) throws Exception {

        String firstName="dagim";
        String lastName="shimelis";
        int age = 20;
        String Field = "Software";


        File file = new File("GUI/files/fileTest1/Names.txt");
        if(file.exists()){
            System.out.println("File already exists");
        }

        PrintWriter output = new PrintWriter(file);

        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.printf("%s\t%s\t%d\t%s\r\n",firstName,lastName,age,Field);
        output.close();

    }
}