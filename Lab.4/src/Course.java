import java.util.Set;
public class Course {
    private String lastName;
    private String description;
    private Professor professor;
    private Set<Student> students;

    public Set<Student> getStudenti() {
        return students;}

    public Professor getProfesor() {
        return professor;}

    public Course(String nume, String descriere, Professor profesor, Set<Student> studenti) {
        this.lastName = nume;
        this.description = descriere;
        this.professor = profesor;
        this.students = studenti;}

    public String getNume() {
        return lastName;}
}