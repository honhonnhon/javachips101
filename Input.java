import java.util.Scanner;// import scanner
public class Input {
    public static void main(String[] args) {
        //1.รับค่าข้อมูลโดยการimport Scanner ของ java
        Scanner sc = new Scanner(System.in);
        //ระบุว่ารับข้อมูลชนิดไหน เลข ข้อความ ?
        System.out.print("Enter your name = ");
        String name = sc.nextLine(); //nextLine รับค่าStringจากแป้นพิมพ์มาเก็บไว้ที่name
        System.out.print("Enter your height = ");
        double height = sc.nextDouble();
        {
            if (height > 10){
                height = height/100;
            }
            else {

            }
        }
        System.out.print("Enter your weight = ");
        double weight = sc.nextDouble();
        System.out.println("Hello " +name);
        double BMI = weight/(height*height);
        System.out.println("BMI = " +BMI);
        if (BMI < 18.5){
            System.out.println("Underweight.");
        }
        else if ((18.5 <= BMI)&&(BMI <= 22.9)){
            System.out.println("Healthy.");
        }
        else if ((23.0 <= BMI)&&(BMI <= 24.9)){
            System.out.println("Overweight.");
        }
        else if ((25.0 <= BMI)&&(BMI <= 29.9)){
            System.out.println("Obese class I.");
        }
        else if (30.0 <= BMI){
            System.out.println("Obese class II.");
        }
        
        sc.close();
    }
}