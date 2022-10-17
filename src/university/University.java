package university;

import java.util.List;

public class University {
    private List<Student> students;
    private List<Professor> professors;

    public University(List<Student> students, List<Professor> professors) {
        this.students = students;
        this.professors = professors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }
}
