# Conversion b/w array and arrayList
import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] arrs = {"A","B","C"};
        ArrayList<String> str1 = new ArrayList<>(Arrays.asList(arrs));
        
        System.out.println(str1);
        
        String arr_str[] = str1.toArray(new String[3]);
        
        for(String ele : arr_str){
        System.out.println(ele.toLowerCase());
        }
    }
}
