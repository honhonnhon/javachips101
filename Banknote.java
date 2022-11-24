import java.util.Scanner;
public class Banknote {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int money = key.nextInt();
        if(money >= 1000){
            if ((money/1000) >= 1){
                System.out.println("Give "+(money/1000)+" 1000 banknote.");
                money = money%1000;
            }
        }
        if((money >= 500) && (money < 1000)){
            if(((money/500) >= 1)&&((money/500) < 2)){
                System.out.println("Give "+(money/500)+" 500 banknote.");
                money = money%500;
            }
        }
        if((money >= 100) && (money < 500)){
            if(((money/100) >= 1)&&((money/100) < 5)){
                System.out.println("Give "+(money/100)+" 100 banknote.");
                money = money%100;
            }
        }
        if((money >= 50) && (money < 100)){
            if(((money/50) >= 1)&&((money/50) < 2)){
                System.out.println("Give "+(money/50)+" 50 banknote.");
                money = money%50;
            }
        }
        if((money >= 20) && (money < 50)){
            if(((money/20) >= 1)&&((money/20) < 3)){
                System.out.println("Give "+(money/20)+" 20 banknote.");
                money = money%20;
            }
        }
        System.out.println("Here is your change : "+money+" THB");
        key.close();
    }
}
