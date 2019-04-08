package application.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@IdClass(AvoirFraisPK.class)
@Entity
@Table(name = "AVOIR_FRAIS")
@XmlRootElement
public class AvoirFrais implements Serializable {
	
  //  @EmbeddedId
    //protected AvoirFraisPK avoirFraisPK;


	@Id
    @Column(name = "NUM_MISSION")
    private String numMission;
    
    @Id
    @Column(name = "NUMORD")
    private short numord;
   
    @Id
    @Column(name = "TYP_FRAIS")
    private String typFrais;
    
    @Id
    @Column(name = "COD_PAYS")
    private String codPays;
    
   

    @Column(name = "VALEUR_P")
    private BigDecimal valeurP;
    
    @Column(name = "VALEUR_R")
    private BigDecimal valeurR;
    
    @Column(name = "SUPPORTE")
    private String supporte;
    
    @Column(name = "SUP_CODE")
    private String supCode;
    
  
    @Column(name = "COD_PRJ")
    private String codPrj;
    
   
    @Column(name = "OBSERV")
    private String observ;
    
    
    @Column(name = "AOBSERV")
    private String aobserv;
 

    @JoinColumns({
        @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false) 
        , @JoinColumn(name = "NUMORD", referencedColumnName = "NUMORD", insertable = false, updatable = false)
        , @JoinColumn(name = "NUM_MISSION", referencedColumnName = "NUM_MISSION", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private OrdMis ordMis;
    
    
    @JoinColumn(name = "COD_PAYS", referencedColumnName = "COD_PAYS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Pays pays;
    
    @JoinColumn(name = "TYP_FRAIS", referencedColumnName = "TYP_FRAIS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TypFrais typFrais1;

	
    
    
	
	public String getNumMission() {
		return numMission;
	}

	public void setNumMission(String numMission) {
		this.numMission = numMission;
	}

	public short getNumord() {
		return numord;
	}

	public void setNumord(short numord) {
		this.numord = numord;
	}

	public String getTypFrais() {
		return typFrais;
	}

	public void setTypFrais(String typFrais) {
		this.typFrais = typFrais;
	}

	public String getCodPays() {
		return codPays;
	}

	public void setCodPays(String codPays) {
		this.codPays = codPays;
	}



	public BigDecimal getValeurP() {
		return valeurP;
	}

	public void setValeurP(BigDecimal valeurP) {
		this.valeurP = valeurP;
	}

	public BigDecimal getValeurR() {
		return valeurR;
	}

	public void setValeurR(BigDecimal valeurR) {
		this.valeurR = valeurR;
	}

	public String getSupporte() {
		return supporte;
	}

	public void setSupporte(String supporte) {
		this.supporte = supporte;
	}

	public String getSupCode() {
		return supCode;
	}

	public void setSupCode(String supCode) {
		this.supCode = supCode;
	}

	public String getCodPrj() {
		return codPrj;
	}

	public void setCodPrj(String codPrj) {
		this.codPrj = codPrj;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getAobserv() {
		return aobserv;
	}

	public void setAobserv(String aobserv) {
		this.aobserv = aobserv;
	}


	public OrdMis getOrdMis() {
		return ordMis;
	}

	public void setOrdMis(OrdMis ordMis) {
		this.ordMis = ordMis;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public TypFrais getTypFrais1() {
		return typFrais1;
	}

	public void setTypFrais1(TypFrais typFrais1) {
		this.typFrais1 = typFrais1;
	}
    

	
}
