import java.util.Scanner;
public class Banknote {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int money = key.nextInt();
        if(money >= 1000){
            System.out.println("Give "+(money/1000)+" 1000 banknote.");
            money %= 1000;
        }
        if(money >= 500){
            System.out.println("Give "+(money/500)+" 500 banknote.");
            money %= 500;
        }
        if(money >= 100){
            System.out.println("Give "+(money/100)+" 100 banknote.");
            money %= 100;
        }
        if(money >= 50){
            System.out.println("Give "+(money/50)+" 50 banknote.");
            money %= 50;
        }
        if(money >= 20){
            System.out.println("Give "+(money/20)+" 20 banknote.");
            money %= 20;
        }
        System.out.println("Here is your change : "+money+" THB");
        key.close();
    }
}
