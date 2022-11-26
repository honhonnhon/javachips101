public class Matrix {
    public static void main(String[] args) {
        int x;
        int y;
        for(y=1;y<=5;y++){
            for(x=1;x<=5;x++){
                if (x!=y){
                    System.out.print(" 0 "); 
                }
                else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println("\n");
        }
    }
}
