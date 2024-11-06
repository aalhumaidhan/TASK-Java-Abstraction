public class Main {
    public static void main(String[] args) {
        Teacher aziz = new Teacher("Aziz", "JavaScript", "CODED Academy", 10);
        Student yousef = new Student("Yousef", "BTA 2024");
        Employee ali = new Employee("Ali", "CODED Academy");
        Artist janna = new Artist("Janna", "Sketching");

        aziz.describeRole();
        yousef.describeRole();
        ali.describeRole();
        janna.describeRole();
    }
}