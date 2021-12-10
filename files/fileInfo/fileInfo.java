package files.fileInfo;

import java.io.File;
import java.util.Scanner;

public class fileInfo {
   public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("Enter File:");
       analyzeFile(input.nextLine());
       input.close();
   }

    static void analyzeFile(String path){

        File name = new File(path);

        if(name.exists()){
            System.out.println(name.getName() + " exists");
            System.out.println((name.isFile() ? "is a File" : "is not a File"));
            System.out.println((name.isDirectory() ? "is Directory" : "is not Directory"));
            System.out.println((name.isAbsolute() ? "is absolute" : "is NOt absolute"));
            System.out.println("Last modified " + name.lastModified());
            System.out.println("Length " + name.length());
            System.out.println("Path " + name.getPath());
            System.out.println("Absolute path" + name.getAbsolutePath());
            System.out.println("parent " + name.getParent());

            if(name.isDirectory()){
                String directory[] = name.list();
                System.out.println("\n\n Directory contents");

                for(String directoryName : directory){
                    System.out.println(directoryName);
                }
            }






        }
        else{
           System.out.println(path + " Does NOT exist "); 
        }



   }
}