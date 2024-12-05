package hr.algebra.pi.gradecalculator.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Subject extends GenericGradeContainer {

    private List<Double> gradeList;

    public Subject(int id, String name, double average, List<Double> gradeList) {
        super(id, name, average);
        this.gradeList = gradeList;
    }

    public List<Double> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Double> gradeList) {
        this.gradeList = gradeList;
    }
}
