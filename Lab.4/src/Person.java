public abstract class Person {///clasa de baza
    String lastName;
    String firstName;

    @Override
    public String toString() {
        return "Persoana{" + "nume=" + lastName + ", prenume=" + firstName +'}';
    }
}