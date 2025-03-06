package Uge9.Student;

import java.util.ArrayList;

public class CourseKlasse {
    private String courseName;
    private int maxParticipants;
    private int courseYear;
    private ArrayList<Student> students;

    public CourseKlasse(String courseName, int maxParticipants, int courseYear) {
        this.courseName = courseName;
        this.maxParticipants = maxParticipants;
        this.courseYear = courseYear;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (students.size() < maxParticipants) {
            students.add(student);
            System.out.println(student.getName() + " tilmeldt til kurset.");
        } else {
            System.out.println("Kurset er fyldt. " + student.getName() + " kan desværre ikke tilmeldes.");
        }
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public void showStudentList() {
        System.out.println("Studerende på kurset " + courseName + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
