import java.util.Scanner;
public class NumCheck {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        float a = key.nextFloat();
        System.out.print("Enter Num 2 : ");
        float b = key.nextFloat();
        if (a == b){
            System.out.println("Num 1 is equal to Num 2.");
        }
        else if (a != b){
            if (a > b){
                System.out.println("Num 1 is more than Num 2.");
            }
            else if (a < b){
                System.out.println("Num 1 is less than Num 2.");
            }
        }
        key.close();
    }
}
