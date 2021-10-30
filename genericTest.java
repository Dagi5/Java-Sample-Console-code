package CONSOLE;

public class genericTest {
    public static void main(String[] args) {
        Integer intARY []= {1,2,3,4,5};
        Double doubleARY []= {1.1, 2.2, 3.3, 4.4, 5.5};
        // String stringARY []= {"one", "two", "three", "four", "five"};

        print(intARY,doubleARY);
        // print(doubleARY);
        // print(stringARY);
    }

    public static <T,E> void print(T []ary, E []ary2){
System.out.println(ary.length);
        for(T value : ary){
            System.out.print(value + " ");
        }

        System.out.println();

        for(E value : ary2){
            System.out.print(value + " ");
        }
    }
}