package model;
// Generated 01/10/2019 15:56:46 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Funcionario generated by hbm2java
 */
@Entity
@Table(name="funcionario"
    ,catalog="pep_hl7"
)
public class Funcionario  implements java.io.Serializable {


     private FuncionarioId id;
     private VacinaAplicada vacinaAplicada;
     private String nome;
     private String login;
     private String senha;
     private String funcao;

    public Funcionario() {
    }

	
    public Funcionario(FuncionarioId id, VacinaAplicada vacinaAplicada) {
        this.id = id;
        this.vacinaAplicada = vacinaAplicada;
    }
    public Funcionario(FuncionarioId id, VacinaAplicada vacinaAplicada, String nome, String login, String senha, String funcao) {
       this.id = id;
       this.vacinaAplicada = vacinaAplicada;
       this.nome = nome;
       this.login = login;
       this.senha = senha;
       this.funcao = funcao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idfuncionario", column=@Column(name="idfuncionario", nullable=false) ), 
        @AttributeOverride(name="vacinaAplicadaIdVacinaAplicada", column=@Column(name="VACINA_APLICADA_idVACINA_APLICADA", nullable=false) ), 
        @AttributeOverride(name="vacinaAplicadaDoseIdDose", column=@Column(name="VACINA_APLICADA_DOSE_idDOSE", nullable=false) ) } )
    public FuncionarioId getId() {
        return this.id;
    }
    
    public void setId(FuncionarioId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="VACINA_APLICADA_idVACINA_APLICADA", referencedColumnName="idVACINA_APLICADA", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="VACINA_APLICADA_DOSE_idDOSE", referencedColumnName="DOSE_idDOSE", nullable=false, insertable=false, updatable=false) } )
    public VacinaAplicada getVacinaAplicada() {
        return this.vacinaAplicada;
    }
    
    public void setVacinaAplicada(VacinaAplicada vacinaAplicada) {
        this.vacinaAplicada = vacinaAplicada;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="login", length=10)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="senha", length=10)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Column(name="funcao", length=45)
    public String getFuncao() {
        return this.funcao;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }




}


