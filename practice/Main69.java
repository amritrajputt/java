package practice;

public class Main69 {
    public static void main(String[] args) {
        Student s1 = new Student("amrit", 21);
        System.out.println("name: "+s1.name+" "+"age: "+s1.age);
    }
}

class Student {
    String name;
    int age;

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
}