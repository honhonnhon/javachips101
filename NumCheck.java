import java.util.Scanner;
public class NumCheck {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        float a = key.nextFloat();
        System.out.print("Enter Num 2 : ");
        float b = key.nextFloat();
        if (a == b){
            System.out.println(a+ " is equal to "+b+".");
        }
        else if (a > b){
            System.out.println(a+ " is greater than "+b+ ".");
        }
        else if (a < b){
            System.out.println(a+ " is less than "+b+".");
        }
        key.close();
    }
}
