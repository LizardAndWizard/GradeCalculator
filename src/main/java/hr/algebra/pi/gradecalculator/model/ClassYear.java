package hr.algebra.pi.gradecalculator.model;

import java.util.List;
import java.util.Optional;

public class ClassYear extends GenericGradeContainer{

    List<Subject> subjects;

    public ClassYear(int id, String name, double average, List<Subject> subjects) {
        super(id, name, average);
        this.subjects = subjects;
    }

    public List<Subject> getAllSubjects() {
        return subjects;
    }

    public Subject getSubjectById(int id) {
        Optional<Subject> subject = subjects.stream().filter(s -> s.getId() == id).findFirst();
        return subject.orElseGet(() -> new Subject(0, "", 0.0, null));
    }

    public Subject getSubjectByName(String name) {
        Optional<Subject> subject = subjects.stream().filter(s -> s.getName().equals(name)).findFirst();
        return subject.orElseGet(() -> new Subject(0, "", 0.0, null));
    }
}
