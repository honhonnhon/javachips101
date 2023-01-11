public class ArrayMeth {
    public static void main(String[] args) {
        int []numsa = {10,20,30,40,50};
        int []numsb = {-50,-20,-30,500,100,300};
        int []numsc = {10,20,30,40,50};
        int []numsd = copyarray(numsb);
        String []fruits = {"มะพร้าว","มะม่วง","ส้ม","องุ่น","แตงโม"};
        
        displayArray(numsb);
        System.out.println("Max value = "+findmaxinarray(numsb));
        System.out.println("Position of max value = "+findmaxindex(numsb));
        System.out.println("Min value = "+findmininarray(numsb));
        System.out.println("Position of min value = "+findminindex(numsb));
        System.out.println("numsa is equal to numsb : "+compareArray(numsa, numsb));
        System.out.println("numsa is equal to numsc : "+compareArray(numsa, numsc));
        displayArray(numsc);
        swapElement(numsc, 1, 2);
        displayArray(numsc);
        displayArray(numsd);
        System.out.println(searchElement(numsa, 30));
        System.out.println(searchElement(fruits, "องุ่น"));
    }
    static void displayArray(int [] arr){
        System.out.print("{");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1)System.out.print(", ");
        }
        System.out.print("}\n");
    }
    static int findmaxinarray(int [] arr){
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
    static int findmininarray(int [] arr){
        int minvalue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    static int findmaxindex(int []arr){
        int maxindex = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>arr[maxindex]){
                maxindex = i;
            }
        }
        return maxindex;
    }
    static int findminindex(int []arr){
        int minindex = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<arr[minindex]){
                minindex = i;
            }
        }
        return minindex;
    }
    static boolean compareArray(int []a,int []b){
        if(a.length != b.length)return false;
        for(int i = 0;i<a.length;i++){
            if(a[i] == b[i])return true;
        }
        return false;
    }
    static void swapElement(int []arr,int x,int y){
        int z;
        z = arr[y];
        arr[y] = arr[x];
        arr[x] = z;
    }
    static int[] copyarray(int []arr){
        int [] newarr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            newarr[i] = arr[i];
        }
        return newarr;
    }
    static int searchElement(int []arr,int a){
        for(int i = 0;i<arr.length;i++){
            if (arr[i] == a){
                return i;
            }
        }
        return -1;
    }
    static int searchElement(String []arr,String a){
        for(int i = 0;i<arr.length;i++){
            if (arr[i].equals(a)){
                return i;
            }
        }
        return -1;
    }
}
