# Custom Objects
import java.util.*;
class Student{
    String name;
    int roll_num;
    Student(String name, int roll_num){
        this.name = name;
        this.roll_num = roll_num;
    }
    public String toString(){
        return "{name:" + name +", roll_num:" + roll_num + "}";
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student("alpha",18);
        arr.add(s1);
        arr.add(new Student("beta",19));
        arr.add(new Student("gamma",20));
        
        System.out.println(arr);
    }
}
