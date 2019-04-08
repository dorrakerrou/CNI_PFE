package application.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.AvoirBudget;
import application.model.AvoirBudgetProjet;
import application.repository.AvoirBudgetProjetRepository;
@Service
@Primary
public class AvoirBudgetProjetDao implements IAvoirBudgetProjet{
@Autowired
AvoirBudgetProjetRepository avoirBudgetRep ; 
	
@Override
	public List<AvoirBudgetProjet> findAll() {
		return avoirBudgetRep.findAll();
	}

public List<AvoirBudgetProjet> getbugetPBydept(String code) {
	return avoirBudgetRep.findBugetPByDept(code);
}

}