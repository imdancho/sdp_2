public class MusicDecorator implements StudentDecorator {
    private Student student;

    public MusicDecorator(Student student) {
        this.student = student;
    }

    @Override
    public void decorate() {
        student.study();
        System.out.println(student.getName() + " is a musician");
    }
}
