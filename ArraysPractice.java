//PRACTISING ARRAYS
import java.util.Arrays;
public class ArraysPractice {

    public static void main(String args[]){
        int ary[] = new int[6];
        
       for(int i=0;i<ary.length;i++){
          int g = i;
           ary[i] = g+3 ;
       }
     
       int ary2x[]=ary.clone();                         //clones the values of the array
       System.out.println(Arrays.toString(ary2x));   //converts the array into string;
       System.out.println(Arrays.toString(ary));  //converts the array into string;
       System.out.println(ary.length);
     for(int j : ary){
        System.out.print(" "+ j);
     }
    }
}