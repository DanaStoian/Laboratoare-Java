public class Professor extends Person {

    @Override
    public String toString() {
        return "Professor{" + "Last name=" +lastName + ", First name=" + firstName + '}';}
    public Professor(String nume, String prenume, Student[] students) {
        this.lastName= nume;
        this.firstName = prenume;}
    public Professor() {
        this.lastName = " ";
        this.firstName="";}
}
