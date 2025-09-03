# Sorting
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,5,6,3,5,7,1,8,4));
        
        Collections.sort(arr);
        System.out.println(arr);
        
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
    }
}
