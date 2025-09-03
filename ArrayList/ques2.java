# removing elements
import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] arr_colors = {"red","green","yellow","blue","white"};
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(arr_colors));
        
        System.out.println(colors.remove("blue"));
            
        colors.remove(1);
        
        System.out.println(colors);
        
        
    }
}
