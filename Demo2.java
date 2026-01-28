import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
       Employee[] arr = new Employee[5];
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            
            String name = sc.next();
            int salary = sc.nextInt();
            arr[i] = new Employee(name, salary);
        } 
        Employee max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i].salary > max.salary){
                max = arr[i];
            }
        }
        System.out.println(max.name);
        sc.close(); 
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