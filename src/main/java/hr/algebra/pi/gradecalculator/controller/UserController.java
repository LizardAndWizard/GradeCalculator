package hr.algebra.pi.gradecalculator.controller;

import hr.algebra.pi.gradecalculator.model.Korisnik;
import hr.algebra.pi.gradecalculator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public Korisnik addUser(@RequestBody Korisnik korisnik) {
        return userService.addUser(korisnik);
    }

    @GetMapping("/user")
    public List<Korisnik> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<Korisnik> getUserById(@PathVariable(value = "id") Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("/user")
    public Korisnik updateUserById(@RequestBody Korisnik inputKorisnik){
        return userService.updateUserById(inputKorisnik);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable(value = "id") Integer id){
        userService.deleteUserById(id);
    }
}
