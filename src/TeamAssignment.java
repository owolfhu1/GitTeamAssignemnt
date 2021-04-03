
import java.util.*;

public class TeamAssignment {

    // method to print out all values in a List<String> void printValues(List<String> list) {} Heval
    static List<String> printValues (List<String> list) {
        List<String> printInputs = new ArrayList<>();

        for (String i : list) {
            printInputs.add(i);
        }
        return printInputs;
    }


    // method to add all the numbers in a List<Integer>: int sum(List<Integer> list) {} Heval


    // method to find the index of a value in a String[]: int getIndex(String[] arr, String value) {} Beritan


    // method to multiply two int together: int multiply(int a, int b) {} İbo


    // method to tell if an int is even: boolean isEven(int number) {} Serap


    // method to print hello world: void helloWorld() {} Hardi
    public void hellowWorld() {
        System.out.println("Hellow World");
    }

    public static void main(String[] args) {

        //You guys can test your codes in this main method. You guys dont need to creat new main method again.

        List<String> strings = Arrays.asList("test1","test2","test3");
        System.out.println(printValues(strings));


    }
}
