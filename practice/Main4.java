package practice;

public class Main4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("amrit", 120000);
        Employee e2 = new Employee("amrit raj", 1200000);
        Employee e3 = new Employee("amrit rajput", 12000000);
        if(e1.salary > e2.salary && e1.salary>e3.salary){
            System.out.println("Highest salary person: "+e1.name);
        }else if(e2.salary > e1.salary && e2.salary>e3.salary){
            System.out.println("Highest salary person: "+e2.name);
        }else{
             System.out.println("Highest salary person: "+e3.name);
        }
    }
}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
