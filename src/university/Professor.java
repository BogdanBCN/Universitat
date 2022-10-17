package university;

import java.util.List;

public class Professor {
    private String name;
    private List<Student> students;

    public Professor(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
