import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = key.nextInt();
        if ((x%2) == 0){
            System.out.println(x+ " is an even number.");
            //Note : Zero is an even number refer from parity of zero.
        }
        else if ((x%2) == 1){
            System.out.println(x+ " is an odd number.");
        }
        key.close();
    }
}
