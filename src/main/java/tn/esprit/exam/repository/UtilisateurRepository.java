package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.CoursClassroom;

@Repository
public interface UtilisateurRepository extends JpaRepository<CoursClassroom, Long> {


}