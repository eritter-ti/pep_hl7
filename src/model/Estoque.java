package model;
// Generated 01/10/2019 15:56:46 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Estoque generated by hbm2java
 */
@Entity
@Table(name="estoque"
    ,catalog="pep_hl7"
)
public class Estoque  implements java.io.Serializable {


     private int idEstoque;
     private Date dataEntrada;
     private String lote;
     private Date validade;
     private String laboratorio;
     private Integer qtd;
     private String obs;
     private Set<Vacina> vacinas = new HashSet<Vacina>(0);

    public Estoque() {
    }

	
    public Estoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }
    public Estoque(int idEstoque, Date dataEntrada, String lote, Date validade, String laboratorio, Integer qtd, String obs, Set<Vacina> vacinas) {
       this.idEstoque = idEstoque;
       this.dataEntrada = dataEntrada;
       this.lote = lote;
       this.validade = validade;
       this.laboratorio = laboratorio;
       this.qtd = qtd;
       this.obs = obs;
       this.vacinas = vacinas;
    }
   
     @Id 

    
    @Column(name="idESTOQUE", unique=true, nullable=false)
    public int getIdEstoque() {
        return this.idEstoque;
    }
    
    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATA_ENTRADA", length=10)
    public Date getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    
    @Column(name="LOTE", length=45)
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="VALIDADE", length=10)
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    
    @Column(name="LABORATORIO", length=45)
    public String getLaboratorio() {
        return this.laboratorio;
    }
    
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    
    @Column(name="QTD")
    public Integer getQtd() {
        return this.qtd;
    }
    
    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    
    @Column(name="OBS", length=245)
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estoque")
    public Set<Vacina> getVacinas() {
        return this.vacinas;
    }
    
    public void setVacinas(Set<Vacina> vacinas) {
        this.vacinas = vacinas;
    }




}

