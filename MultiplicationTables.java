import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       System.out.print("Enter number : ");
       int x = key.nextInt();
       int y = 1;
       System.out.println(x+" Times Table.");
       while (y <= 12) {
            System.out.println(x+"x"+y+" = "+(x*y));
            y++;
       }
       key.close();
    }
}
