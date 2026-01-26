package practice;

public class Main6 {
    public static void main(String[] args) {
        Student s1 = new Student("amrit",29);
    }
}
class Student{
    String name;
    int roll;
    static int count =0;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        count++;
        System.out.println("Total students created: " + count);
        
    }
}