package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private List<Grade> grades;

    public Student(String name, List<Grade> grades) {
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Name can't be null string");
        } else {
            this.name = name;
        }
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

}
