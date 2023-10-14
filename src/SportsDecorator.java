public class SportsDecorator implements StudentDecorator {
    private Student student;

    public SportsDecorator(Student student) {
        this.student = student;
    }

    @Override
    public void decorate() {
        student.study();
        System.out.println(student.getName() + " is a sportsman");
    }
}
