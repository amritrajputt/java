package oops;

public class Main {
    public static void main(String[] args) {

        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

        Student s1 = new Student(80.5f,"amrit",29);  // student() is constructor 
            // s1.rollNo=29;
            // s1.name="amrit";
            // s1.marks = 80.5f; 
        s1.greeting("amrit");
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);
        System.out.println(s1.name);
        s1.changeName("amrit rajput");
        System.out.println(s1.name);

        Student s2 = new Student(50.5f,"anshu",19); 
        s2.greeting("anshu");
        System.out.println(s2.rollNo);
        System.out.println(s2.marks);
        System.out.println(s2.name);
        
    }
}
class Student{
    float marks;
    String name;
    int rollNo;

    void greeting(String name){
        System.out.println("hello my name is "+ this.name); 
    }

void changeName(String newName){
       this.name = newName;
    }

        Student(){
          this. marks = marks;
          this. name = name;
          this. rollNo= rollNo;
        }
         Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    Student(float marks,String name,int rollNo){
        this.marks = marks;
        this.name = name;
        this.rollNo= rollNo;
    }
}