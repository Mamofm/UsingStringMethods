import java.util.Scanner;

public class UsingStringMethods {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = in.nextLine();

            System.out.print("Enter a Index: ");
            int idx = in.nextInt();

            System.out.println("The length of alphabet is: " + word.length());
            System.out.println("The substring from 0 to 3 is: " + word.substring(0, idx));
        }
    }
