package comparator;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rollNo;
    double marks;
    public Student(String name,int rollNo,double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public int compareTo(Student s){
        return (int)(this.marks - s.marks);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("amrit", 29, 99);
        Student s2 = new Student("ashish", 52, 80);
        Student s3 = new Student("johnny", 69, 98);
        Student s4 = new Student("mia", 96, 86);
        Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for(Student s:arr){
            System.out.println(s.name+" "+s.rollNo+ " "+ s.marks);
        }
    }
}
