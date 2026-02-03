package comparing;

public class Main{
    public static void main(String[] args) {
        Student kunal = new Student(12, 90);
        Student amrit = new Student(29, 99);
        if(kunal.compareTo(amrit) < 0){
            System.out.println(kunal.compareTo(amrit));
            System.out.println("amrit has more marks");
        }
    }
}
