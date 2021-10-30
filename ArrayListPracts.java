//PRACTISING ARRAYLISTS
package CONSOLE;
import java.util.ArrayList;
public class ArrayListPracts {
    public static void main(String srgd[]){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("black");
        colors.add(3,"pink");
        colors.remove(3);
for(int i=0;i<colors.size();i++){
    System.out.println( colors.get(i) );
}
System.out.println( colors.size());

    }
}