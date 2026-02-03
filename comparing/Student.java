package comparing;

public class Student implements Comparable<Student>{
    int rollno;
    int marks;
    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o){
        int diff = (int) (this.marks - o.marks);
        // if diff == 0  --> equal
        // if diff < 0 --> o is bigger else o is smaller
         return diff;
    }
    
}
