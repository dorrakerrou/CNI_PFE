package application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@IdClass(AvoirBudgetPK.class)
@Entity
public class AvoirBudget implements Serializable  {

	//@EmbeddedId
   // protected AvoirBudgetPK avoiBudgetPK;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @Column(name = "CODE")
		private String code ;
	@Id
		 @Column(name = "DATE_BUDG")
		private Date date_budg ;
	private Date annee ; 	
	private Double valeur_miss ; 
	private String reference_mis ; 
	private Double valeur_tr ; 
	private Date date_val ; 
	private String cod_util ; 
	private String type_budget ;
	
	
	@JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DeptGen depart;
	

	
	
	
	public AvoirBudget(String code, Date date_budg, Date annee, Double valeur_miss, String reference_mis,
			Double valeur_tr, Date date_val, String cod_util, String type_budget, DeptGen depart) {
		super();
		this.code = code;
		this.date_budg = date_budg;
		this.annee = annee;
		this.valeur_miss = valeur_miss;
		this.reference_mis = reference_mis;
		this.valeur_tr = valeur_tr;
		this.date_val = date_val;
		this.cod_util = cod_util;
		this.type_budget = type_budget;
		this.depart = depart;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate_budg() {
		return date_budg;
	}
	public void setDate_budg(Date date_budg) {
		this.date_budg = date_budg;
	}
	public DeptGen getDepart() {
		return depart;
	}
	public void setDepart(DeptGen depart) {
		this.depart = depart;
	}
	public Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public Double getValeur_miss() {
		return valeur_miss;
	}
	public void setValeur_miss(Double valeur_miss) {
		this.valeur_miss = valeur_miss;
	}
	public String getReference_mis() {
		return reference_mis;
	}
	public void setReference_mis(String reference_mis) {
		this.reference_mis = reference_mis;
	}
	public Double getValeur_tr() {
		return valeur_tr;
	}
	public void setValeur_tr(Double valeur_tr) {
		this.valeur_tr = valeur_tr;
	}
	public Date getDate_val() {
		return date_val;
	}
	public void setDate_val(Date date_val) {
		this.date_val = date_val;
	}
	public String getCod_util() {
		return cod_util;
	}
	public void setCod_util(String cod_util) {
		this.cod_util = cod_util;
	}
	public String getType_budget() {
		return type_budget;
	}
	public void setType_budget(String type_budget) {
		this.type_budget = type_budget;
	}

	public AvoirBudget() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annee == null) ? 0 : annee.hashCode());
		result = prime * result + ((cod_util == null) ? 0 : cod_util.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((date_budg == null) ? 0 : date_budg.hashCode());
		result = prime * result + ((date_val == null) ? 0 : date_val.hashCode());
		result = prime * result + ((depart == null) ? 0 : depart.hashCode());
		result = prime * result + ((reference_mis == null) ? 0 : reference_mis.hashCode());
		result = prime * result + ((type_budget == null) ? 0 : type_budget.hashCode());
		result = prime * result + ((valeur_miss == null) ? 0 : valeur_miss.hashCode());
		result = prime * result + ((valeur_tr == null) ? 0 : valeur_tr.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvoirBudget other = (AvoirBudget) obj;
		if (annee == null) {
			if (other.annee != null)
				return false;
		} else if (!annee.equals(other.annee))
			return false;
		if (cod_util == null) {
			if (other.cod_util != null)
				return false;
		} else if (!cod_util.equals(other.cod_util))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (date_budg == null) {
			if (other.date_budg != null)
				return false;
		} else if (!date_budg.equals(other.date_budg))
			return false;
		if (date_val == null) {
			if (other.date_val != null)
				return false;
		} else if (!date_val.equals(other.date_val))
			return false;
		if (depart == null) {
			if (other.depart != null)
				return false;
		} else if (!depart.equals(other.depart))
			return false;
		if (reference_mis == null) {
			if (other.reference_mis != null)
				return false;
		} else if (!reference_mis.equals(other.reference_mis))
			return false;
		if (type_budget == null) {
			if (other.type_budget != null)
				return false;
		} else if (!type_budget.equals(other.type_budget))
			return false;
		if (valeur_miss == null) {
			if (other.valeur_miss != null)
				return false;
		} else if (!valeur_miss.equals(other.valeur_miss))
			return false;
		if (valeur_tr == null) {
			if (other.valeur_tr != null)
				return false;
		} else if (!valeur_tr.equals(other.valeur_tr))
			return false;
		return true;
	}
	
	
	

}
