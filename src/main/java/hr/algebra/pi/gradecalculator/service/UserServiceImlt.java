package hr.algebra.pi.gradecalculator.service;

import hr.algebra.pi.gradecalculator.model.Korisnik;
import hr.algebra.pi.gradecalculator.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImlt implements UserService {
    final
    UserRepo userRepo;

    public UserServiceImlt(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Korisnik addUser(Korisnik korisnik) {
        return userRepo.save(korisnik);
    }

    @Override
    public List<Korisnik> getAllUsers() {
        return userRepo.findAll().stream().toList();
    }

    @Override
    public Optional<Korisnik> getUserById(Integer id) {
        return userRepo.findById(id);
    }

    @Override
    public Korisnik updateUserById(Korisnik inputKorisnik) {
        Optional<Korisnik> user = userRepo.findById(inputKorisnik.getId());
        Korisnik updatedKorisnik = user.get();
        /*
        updatedEmployee.setEmployeeName(inputEmployee.getEmployeeName());
        updatedEmployee.setDesignation(inputEmployee.getDesignation());
        updatedEmployee.setExperience(inputEmployee.getExperience());
        */
        return userRepo.save(updatedKorisnik);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }
}
