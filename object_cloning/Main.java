package object_cloning;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human amrit= new Human(21, "amrit");
        // Human twin = new Human(amrit);//copy of object amrit
        Human twin = (Human)amrit.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
