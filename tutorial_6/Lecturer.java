public class Lecturer extends Employee {
    private final String subject;
    private final String department;

    public Lecturer(String id, String name, String subject) {
        super(id, name);
        this.subject = subject;
        this.department = "Faculty of Information Technology";
    }

    public void displaySubject() {
        System.out.println("Subject     : " + subject);
        System.out.println("Department  : " + department);
    }
}