public class VariableArg {
    public static void main(String[] args) {
        summatation(10,20,40,50,70);
    }
    public static void summatation(int...num){
        int sum = 0;
        for(int i = 0;i<num.length;i++){
            sum += num[i]; 
        }
        System.out.println("Sum is "+sum);
    }
}
