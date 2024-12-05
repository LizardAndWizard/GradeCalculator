package hr.algebra.pi.gradecalculator.repository;

import hr.algebra.pi.gradecalculator.model.Subject;

import java.util.List;
import java.util.Optional;

public class SubjectRepository implements Repository<Subject> {

    @Override
    public int create(Subject object) throws Exception {
        return 0;
    }

    @Override
    public void create(List<Subject> objects) throws Exception {

    }

    @Override
    public void update(int id, Subject object) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public Optional<Subject> select(int id) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<Subject> selectAll() throws Exception {
        return List.of();
    }
}
