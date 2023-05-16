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
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeClasse; // Identifiant projet (Clé primaire)

    private String titre;


    @Enumerated(EnumType.STRING)
    private Niveau niveau;

}
