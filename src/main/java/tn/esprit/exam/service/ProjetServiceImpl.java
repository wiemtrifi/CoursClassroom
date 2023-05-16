package tn.esprit.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.CoursClassroom;
import tn.esprit.exam.repository.UtilisateurRepository;

import java.util.List;

@Service
@Slf4j
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    UtilisateurRepository projetRepository;


    @Scheduled(fixedDelay = 10000)
    public List<CoursClassroom> retrieveAllProjets() {

        //log.info("In Method : retrieveAllProjets ");

        List<CoursClassroom> listProjets = projetRepository.findAll();
        for (CoursClassroom projet : listProjets) {
            log.info("j'affiche un prjet : " + projet);
        }

        //log.info("Out of Method : retrieveAllProjets ");

        return listProjets;

    }

    public CoursClassroom retrieveProjet(Long projetId) {
        return projetRepository.findById(projetId).get();
    }

    public CoursClassroom addProjet(CoursClassroom p) {
        return projetRepository.save(p);
    }

    public void removeProjet(Long projetId) {
        projetRepository.deleteById(projetId);
    }

    public CoursClassroom modifyProjet(CoursClassroom projet) {
        return projetRepository.save(projet);
    }

    // Projet et ProjetDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le Projet et le Projet Detail
    public CoursClassroom addProjetAndProjetDetailAndAssign(CoursClassroom projet) {
        return projetRepository.save(projet);
    }


}
