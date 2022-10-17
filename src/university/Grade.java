package university;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int value;
    private boolean isPassingGrade;

    public Grade(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Wrong grade value");
        }
        this.isPassingGrade = !(this.value < 40);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getIsPassingGrade() {
        return isPassingGrade;
    }

    public void setIsPassingGrade(boolean isPassingGrade) {
        this.isPassingGrade = isPassingGrade;
    }

    static public int roundGradeValue(int gradeValue) {
        if (gradeValue % 5 >= 3 && gradeValue > 38) {
            gradeValue = gradeValue / 5;
            gradeValue = (gradeValue * 5) + 5;
        }
        return gradeValue;
    }

    static public List<Grade> returnFailingGrades(List<Grade> allGrades) {
        List<Grade> failingGrades = new ArrayList<>();
        for (Grade grade : allGrades) {
            if (!grade.getIsPassingGrade()) {
                failingGrades.add(grade);
            }
        }
        return failingGrades;
    }

    static public int returnAverageGrade(List<Grade> allGrades) {
        int sum = 0;
        for (Grade grade : allGrades) {
            sum = sum + grade.value;
        }
        return sum / allGrades.size();
    }

    static public List<Grade> returnRoundedDownGrades(List<Grade> allGrades) {
        List<Grade> roundedDownGrades = new ArrayList<>();
        for (Grade grade : allGrades) {
            grade.value = roundGradeValue(grade.value);
            if (grade.value < 40) {
                grade.isPassingGrade = false;
            }
            roundedDownGrades.add(grade);
        }
        return roundedDownGrades;
    }

    static public Grade returnMaximalRoundedGrade(List<Grade> allGrades) {
        Grade maximalRoundedGrade = new Grade(0);
        List<Grade> roundedDownGrades = returnRoundedDownGrades(allGrades);
        for (Grade grade : roundedDownGrades) {
            if (grade.value > maximalRoundedGrade.value) {
                maximalRoundedGrade.value = grade.value;
            }
        }
        if (maximalRoundedGrade.value < 40) {
            maximalRoundedGrade.isPassingGrade = false;
        }
        return maximalRoundedGrade;
    }
}
