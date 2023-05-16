package tn.esprit.exam.entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoursClassroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Identifiant projet (Clé primaire)

    private String nom;

    private Integer nbHeures;
    private Boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    private Classe classe;
}
