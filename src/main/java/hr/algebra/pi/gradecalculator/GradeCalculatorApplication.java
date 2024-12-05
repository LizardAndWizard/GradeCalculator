package hr.algebra.pi.gradecalculator;

import hr.algebra.pi.gradecalculator.model.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradeCalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(GradeCalculatorApplication.class, args);

        String password = "password";
        String hash = null;
        byte[] salt = Security.getSalt();

        try {
            hash = Security.generatePasswordHash(password, salt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hash: " + hash);
        System.out.println("Salt: " + salt);

        String pswd = "password";
        try {
            if (Security.verifyPassword(pswd, hash, salt, 65536, 256))
                System.out.println("Verified");
            else
                System.out.println("Not verified");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
