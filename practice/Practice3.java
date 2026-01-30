public class Practice3 {
    public static void main(String[] args) {
        Address addr = new Address("Lucknow", 226301);
        Person p = new Person("Amrit", addr);
        System.out.println("name: "+p.name+" city: " + p.address.city +" pincode: "+p.address.pincode);
    }
}

class Address{
    String city;
    int pincode;
    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }
}
class Person{
    String name;
    Address address;
     Person(String name, Address address) {
        this.name = name;
      this.address = address;
    }
}