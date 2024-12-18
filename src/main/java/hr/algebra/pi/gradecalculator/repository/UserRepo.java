package hr.algebra.pi.gradecalculator.repository;

import hr.algebra.pi.gradecalculator.model.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Korisnik, Integer> {
}
