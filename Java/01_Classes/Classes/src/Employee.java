public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee() {
        System.out.println("Employee constructor called");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
