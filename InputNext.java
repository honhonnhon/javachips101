import java.util.Scanner;
public class InputNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.next();
        System.out.println(name+ " is your name.");
        sc.close();
    }
}//การใช้Nextจะไม่อ่านตั้งแต่ช่องว่างเป็นต้นไปแต่ NextLineจะอ่านช่องว่างด้วย nextจะใช้เช็คว่ายังมีข้อมูลให้อ่านเพิ่มไหม
