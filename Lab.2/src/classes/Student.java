//1.Add a method getFullName() to both the Student and Professor classes
//that returns the full name in the format "FirstName LastName".
package classes;
public class Student {
    String firstName;
    String lastName;
    int groupNumber;
    public
    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber= groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName +
                ",lastName=" + lastName + "groupNumber="+ groupNumber +'}';
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
}