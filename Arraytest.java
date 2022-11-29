public class Arraytest {
    public static void main(String[] args) {
        String [][] product = {
            {"Mouse","Keyboard","Headphone"},
            {"CPU","GPU","Mainboard"},
            {"Mousepad","Desk","Chair"}
        };
        for (int row = 0;row < product.length;row++){
            for (int column = 0;column < product[row].length;column++){
                System.out.println("Product name (row "+row+" column "+column+") : "+product[row][column]);
            }
        }
    }
}
