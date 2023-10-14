public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student john = new Student("John");

        StudentDecorator sportsStudent = new SportsDecorator(john);
        StudentDecorator musicAndSportsStudent = new MusicDecorator((Student) sportsStudent);

        System.out.println("Shoma's normal day:");
        john.study();

        System.out.println("\nShoma's day with sports:");
        sportsStudent.decorate();

        System.out.println("\nShoma's day with sports and music:");
        musicAndSportsStudent.decorate();
    }
}

