package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.AvoirBudget;
import application.model.AvoirBudgetProjet;
import application.service.AvoirBudgetDao;
import application.service.AvoirBudgetProjetDao;



@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirBudgetProjetController {
	@Autowired
	private AvoirBudgetProjetDao avoirBudgetProjetDao ; 
	
	@GetMapping("/listeBudgetProjet")
	public List<AvoirBudgetProjet> getFrais() {
		return avoirBudgetProjetDao.findAll() ;  
	}

}
