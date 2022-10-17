package university;

public class Grade {
    private double value;
    private boolean passingGrade;

    public Grade(double value, boolean passingGrade) {
        this.value = value;
        this.passingGrade = passingGrade;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isPassingGrade() {
        return passingGrade;
    }

    public void setPassingGrade(boolean passingGrade) {
        this.passingGrade = passingGrade;
    }
}
