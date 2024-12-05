package hr.algebra.pi.gradecalculator.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    int create(T object) throws Exception;

    void create(List<T> objects) throws Exception;

    void update(int id, T object) throws Exception;

    void delete(int id) throws Exception;

    Optional<T> select(int id) throws Exception;

    List<T> selectAll() throws Exception;
}
