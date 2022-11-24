import java.util.Scanner;
public class BEtoAD {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = key.nextInt();
        System.out.print("BE or AD : ");
        String bead = key.next();
        int year2;
        switch (bead) {
            case "BE":
                year2 = year - 543;
                System.out.println(year+"BE\n"+year2+"AD");
                break;
            case "AD":
                year2 = year + 543;
                System.out.println(year+"AD\n"+year2+"BE");
                break;
            default: 
                System.out.println("error");
                break;
        }
        key.close();
    }
}