import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String lastName;
    private String firstName;
    private int group;
    public Student(String nume, String prenume, int grup) {
        this.lastName = nume;
        this.firstName = prenume;
        this.group = grup;}
    public String getNume() {
        return lastName;}
    public String getPrenume() {
        return firstName;}

    public int getGrup() {
        return group;}

    @Override
    public int compareTo(Student altStudent) {
        int rezultatComparare = this.lastName.compareTo(altStudent.lastName);
        if (rezultatComparare == 0) {
            rezultatComparare = this.firstName.compareTo(altStudent.firstName);
        }
        return rezultatComparare;}

    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Stoian", "Dana", 1));
        studenti.add(new Student("Ionescu", "Andrei", 2));
        studenti.add(new Student("Georgescu", "Antonia", 3));

        Collections.sort(studenti);

        for (Student student : studenti) {
            System.out.println(student.getNume() + " " + student.getPrenume());
        }
    }
}