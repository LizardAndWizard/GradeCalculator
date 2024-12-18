package hr.algebra.pi.gradecalculator.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "Korisnik")
public class Korisnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idkorisnik;
    private String korisnickoIme;
    private String ePosta;
    private String lozinkaHash;
    private String lozinkaSalt;
    private Double ukupnaOcjena;
    private Long ulogaId;

    public Integer getId() {
        return idkorisnik;
    }

    /*
    @OneToOne
    @JoinColumn(name = "UlogaID", nullable = false)
    private Role uloga;
     */
    //private List<Godina> godine;

    /*


    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getLozinkaHash() {
        return lozinkaHash;
    }

    public void setLozinkaHash(String lozinkaHash) {
        this.lozinkaHash = lozinkaHash;
    }

    public String getLozinkaSalt() {
        return lozinkaSalt;
    }

    public void setLozinkaSalt(String lozinkaSalt) {
        this.lozinkaSalt = lozinkaSalt;
    }

    public Double getUkupnaOcjena() {
        return ukupnaOcjena;
    }

    public void setUkupnaOcjena(Double ukupnaOcjena) {
        this.ukupnaOcjena = ukupnaOcjena;
    }

    public Long getUlogaId() {
        return ulogaId;
    }

    public void setUlogaId(Long ulogaId) {
        this.ulogaId = ulogaId;
    }

     */
}
