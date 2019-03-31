package application.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.model.AvoirBudget;
import application.model.AvoirFrais;
import application.service.AvoirBudgetDao;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AvoirBudgetController {
	@Autowired
	private AvoirBudgetDao avoirBudgetDao ; 
	
	
	@GetMapping("/listeBudget")
	public List<AvoirBudget> getFrais() {
		return avoirBudgetDao.findAll() ;  
	}
	
	@GetMapping("/listbyyear")
	public List<AvoirBudget>  findbugetByyearsBydept(@RequestParam(name="codeDept",defaultValue="") String codeDept,@RequestParam(name="date_budg",defaultValue="") Date date_budg){
		return avoirBudgetDao. getbugetByyearsBydept(codeDept, date_budg);
		
	}
	
	@PostMapping("/addbudget")
	public AvoirBudget addBudget(AvoirBudget a) {
		return avoirBudgetDao.addBudget(a);
	}
	
	@GetMapping("/budgetbytype")
	public List<AvoirBudget> findBudget(@RequestParam(name="type_budget",defaultValue="")String type_budget){
		return avoirBudgetDao.getBudgetByType(type_budget);
	}
	
	@GetMapping("/budgetbydate")
	public List<AvoirBudget> getbudgetbyDate(@RequestParam(name="date_val",defaultValue="")Date date_val){
		return avoirBudgetDao.getBugetByDate(date_val);
	}
	
}
