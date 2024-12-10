package hr.algebra.pi.gradecalculator.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDLog;

    //Dodati anotaciju za veličinu stringa
    private String Opis;
    private DateTimeAtCreation Vrijeme;
}
