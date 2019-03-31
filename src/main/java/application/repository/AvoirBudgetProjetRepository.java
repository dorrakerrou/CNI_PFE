package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.AvoirBudgetProjet;
import application.model.AvoirBudgetProjetPK;



@Repository
public interface  AvoirBudgetProjetRepository extends JpaRepository<AvoirBudgetProjet,Class< AvoirBudgetProjetPK>>
{}

