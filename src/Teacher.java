class Teacher extends Person {
    private String subject;
    private String school;
    private int yearsTeaching;

    public Teacher(String name, String subject, String school, int yearsTeaching) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.yearsTeaching = yearsTeaching;
    }

    @Override
    void describeRole() {
        System.out.println(getName() + " is an employee at " + school + " and they have been teaching " + subject + " for " + yearsTeaching + " years.");
    }
}
