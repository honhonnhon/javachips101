import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int Maxnum = Integer.MIN_VALUE, Minnum = Integer.MAX_VALUE;
        while(true){
            System.out.print("Enter number : ");
            int num = key.nextInt();
            if (num<0)break; //Enter minus value to end program
            if (num>Maxnum)Maxnum = num;
            if (num<Maxnum)Minnum = num;
        }
        System.out.println("Max number = "+Maxnum);
        System.out.println("Min number = "+Minnum);
        key.close();
    }
}
