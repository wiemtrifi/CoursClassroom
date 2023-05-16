package tn.esprit.exam.service;

import tn.esprit.exam.entity.CoursClassroom;

import java.util.List;

public interface IProjetService {

    public List<CoursClassroom> retrieveAllProjets();

    public CoursClassroom retrieveProjet(Long projetId);

    public CoursClassroom addProjet(CoursClassroom p);

    public void removeProjet(Long projetId);

    public CoursClassroom modifyProjet(CoursClassroom projet);

}
