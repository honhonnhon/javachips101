import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter Temp : ");
        float t = key.nextFloat();
        System.out.print("Enter unit (C F K) : ");
        String u = key.next();
        switch (u) {
            case "C":
                System.out.println("C = "+t);
                System.out.println("F = "+((t*1.8)+32));
                System.out.println("K = "+(t+273.15));
                break;
            case "F":
                System.out.println("C = "+((t-32)/1.8));
                System.out.println("F = "+t);
                System.out.println("K = "+(((t-32)/1.8)+273.15));
                break;
            case "K":
                System.out.println("C = "+(t-273.15));
                System.out.println("F = "+(((t-273.15)*1.8)+32));
                System.out.println("K = "+t);
                break;
            default:
                break;
        }
        key.close();
    }
}
