public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmad", "P001");
        Student p2 = new Student("Ali", "S001");
        Lecturer p3 = new Lecturer("Dr. Sara", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}