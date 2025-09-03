# Search and Containment
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,7,7}));
        System.out.println(num);
        System.out.println(num.contains(5));
        System.out.println(num.indexOf(7));
        System.out.println(num.lastIndexOf(7));
    }
}
