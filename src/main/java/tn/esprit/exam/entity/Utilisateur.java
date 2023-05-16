package tn.esprit.exam.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser; // Identifiant projet (Clé primaire)

    private String prenom;
    private String nom;
    private String password;
    
    @ManyToOne(cascade = CascadeType.ALL)
    Classe classe;

}
