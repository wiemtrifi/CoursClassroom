package tn.esprit.exam.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.CoursClassroom;
import tn.esprit.exam.service.IProjetService;

import java.util.List;

@Tag(name = "Web Services pour la gestion de Projets")
@RestController
@RequestMapping("/projet")
public class ProjetRestController {

    @Autowired
    IProjetService projetService;

    // http://localhost:8089/exam/projet/retrieve-all-projets

    @Operation(description = "Ceci récupère la liste de tous les Projets")
    @GetMapping("/retrieve-all-projets")
    public List<CoursClassroom> getProjets() {
        List<CoursClassroom> listProjets = projetService.retrieveAllProjets();
        return listProjets;
    }


    // http://localhost:8089/exam/projet/retrieve-projet/8
    @GetMapping("/retrieve-projet/{projet-id}")
    public CoursClassroom retrieveProjet(@PathVariable("projet-id") Long proejtId) {
        CoursClassroom projet = projetService.retrieveProjet(proejtId);
        return projet;
    }

    // http://localhost:8089/exam/projet/add-projet
    @PostMapping("/add-projet")
    public CoursClassroom addProjet(@RequestBody CoursClassroom p) {
        CoursClassroom projet = projetService.addProjet(p);
        return projet;
    }

    // http://localhost:8089/exam/projet/remove-projet/{projet-id}
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long proejtId) {
        projetService.removeProjet(proejtId);
    }

    // http://localhost:8089/exam/projet/modify-projet
    @PutMapping("/modify-projet")
    public CoursClassroom modifyProjet(@RequestBody CoursClassroom p) {
        CoursClassroom projet = projetService.modifyProjet(p);
        return projet;
    }


}
