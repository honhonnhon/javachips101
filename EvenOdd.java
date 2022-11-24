import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = key.nextInt();
        String result = "";
        result = (x%2 == 0) ? x+ " is an even number." : x+ " is an odd number.";
        //Note : Zero is an even number refer from parity of zero.
        System.out.println(result);
        key.close();
    }
}