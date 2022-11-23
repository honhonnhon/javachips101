import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A ");
        float a = sc.nextFloat();
        System.out.print("Enter value of B ");
        float b = sc.nextFloat();
        System.out.print("Enter Operator ");
        String op = sc.next();
        System.out.println(a +op +b);
        {
            switch (op) {
                case "+":
                    System.out.println("result = "+(a+b));
                    break;
                case "-":   
                    System.out.println("result = "+(a-b));
                    break;
                case "*":   
                    System.out.println("result = "+(a*b));
                    break;
                case "/":   
                    System.out.println("result = "+(a/b));
                    break;
                case "%":   
                    System.out.println("result = "+(a%b));
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }
        sc.close();
    }
}
