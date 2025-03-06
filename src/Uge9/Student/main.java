package Uge9.Student;


public class main {
    public static void main(String[] args) {

        Student student1 = new Student("MOhamed", 1);
        Student student2 = new Student("Junes", 2);


        CourseKlasse javaCourse = new CourseKlasse("Java Programming", 2, 2026);
        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        javaCourse.showStudentList();
    }
}

