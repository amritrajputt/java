


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(29, "Amrit", 84.2f);
        System.out.println(s1.rollNo + " " + s1.name + " " + s1.marks);
        

        Student s2 = new Student(19, "Ajit", 74f);
        System.out.println(s2.rollNo + " " + s2.name + " " + s2.marks);
    }
}

 class Student {
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks) {
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }
    
   
}

