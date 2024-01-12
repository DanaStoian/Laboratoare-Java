public class Professor extends Person {
    private String title;
    public Professor() {
        this.name = "";
        this.surname = "";}
    public Professor(String name, String surname, String title) {
        this.name = name;
        this.surname = surname;}

    @Override
    public String toString() {
        return "Professor { " + "name=" + name + ", surname=" + surname + ',';
    }
}