package task6;

public class Person {
    // Attributes
    public String name;
    public int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating an instance of Person
        Person p = new Person("Siddu", 25);

        // Displaying the name and age using getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

