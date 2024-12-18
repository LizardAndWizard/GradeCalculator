package hr.algebra.pi.gradecalculator.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Uloga")
public class Uloga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String naziv;
}
