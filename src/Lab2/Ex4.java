package Lab2; //Q2

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex4 {

    public String sortStrings(String arr2[]){

        String s1="";
        String s2="";

        // Sorting the strings
        arr2 = Stream.of(arr2)
                .sorted()
                .toArray(String[]::new);

        s1= Arrays.toString(arr2).substring(0,8).toUpperCase(Locale.ROOT);
        s2 = Arrays.toString(arr2).substring(8,18);

        return s1+s2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[6];
        System.out.println("Enter the Alphabets");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.next();
        }

        Ex4 s = new Ex4();
        System.out.println(s.sortStrings(arr));;


    }
}
