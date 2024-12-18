package hr.algebra.pi.gradecalculator.service;

import hr.algebra.pi.gradecalculator.model.Korisnik;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public Korisnik addUser(Korisnik korisnik);

    public List<Korisnik> getAllUsers();

    public Optional<Korisnik> getUserById(Integer id);

    public Korisnik updateUserById(Korisnik inputKorisnik);

    public void deleteUserById(Integer id);
}
