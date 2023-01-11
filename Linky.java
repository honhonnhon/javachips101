import java.util.Iterator;
import java.util.LinkedList;
public class Linky {
    public static void main(String[] args) {
        LinkedList<Integer> Linky = new LinkedList<Integer>();
        Linky.add(1);
        Linky.add(72);
        Linky.add(2);
        
        Iterator it = Linky.iterator();
            while (it.hasNext()){
                if((int)it.next() == 72){
                    System.out.println();
                }
            }
    }
}
