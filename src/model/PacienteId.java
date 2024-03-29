package model;
// Generated 01/10/2019 15:56:46 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PacienteId generated by hbm2java
 */
@Embeddable
public class PacienteId  implements java.io.Serializable {


     private int idPaciente;
     private int vacinaAplicadaIdVacinaAplicada;
     private int vacinaAplicadaDoseIdDose;
     private int vacinaIdVacina;
     private int vacinaEstoqueIdEstoque;
     private int historicoAtendimentoIdhistoricoAtendimento;

    public PacienteId() {
    }

    public PacienteId(int idPaciente, int vacinaAplicadaIdVacinaAplicada, int vacinaAplicadaDoseIdDose, int vacinaIdVacina, int vacinaEstoqueIdEstoque, int historicoAtendimentoIdhistoricoAtendimento) {
       this.idPaciente = idPaciente;
       this.vacinaAplicadaIdVacinaAplicada = vacinaAplicadaIdVacinaAplicada;
       this.vacinaAplicadaDoseIdDose = vacinaAplicadaDoseIdDose;
       this.vacinaIdVacina = vacinaIdVacina;
       this.vacinaEstoqueIdEstoque = vacinaEstoqueIdEstoque;
       this.historicoAtendimentoIdhistoricoAtendimento = historicoAtendimentoIdhistoricoAtendimento;
    }
   


    @Column(name="idPACIENTE", nullable=false)
    public int getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    @Column(name="VACINA_APLICADA_idVACINA_APLICADA", nullable=false)
    public int getVacinaAplicadaIdVacinaAplicada() {
        return this.vacinaAplicadaIdVacinaAplicada;
    }
    
    public void setVacinaAplicadaIdVacinaAplicada(int vacinaAplicadaIdVacinaAplicada) {
        this.vacinaAplicadaIdVacinaAplicada = vacinaAplicadaIdVacinaAplicada;
    }


    @Column(name="VACINA_APLICADA_DOSE_idDOSE", nullable=false)
    public int getVacinaAplicadaDoseIdDose() {
        return this.vacinaAplicadaDoseIdDose;
    }
    
    public void setVacinaAplicadaDoseIdDose(int vacinaAplicadaDoseIdDose) {
        this.vacinaAplicadaDoseIdDose = vacinaAplicadaDoseIdDose;
    }


    @Column(name="VACINA_idVACINA", nullable=false)
    public int getVacinaIdVacina() {
        return this.vacinaIdVacina;
    }
    
    public void setVacinaIdVacina(int vacinaIdVacina) {
        this.vacinaIdVacina = vacinaIdVacina;
    }


    @Column(name="VACINA_ESTOQUE_idESTOQUE", nullable=false)
    public int getVacinaEstoqueIdEstoque() {
        return this.vacinaEstoqueIdEstoque;
    }
    
    public void setVacinaEstoqueIdEstoque(int vacinaEstoqueIdEstoque) {
        this.vacinaEstoqueIdEstoque = vacinaEstoqueIdEstoque;
    }


    @Column(name="historico_atendimento_idhistorico_atendimento", nullable=false)
    public int getHistoricoAtendimentoIdhistoricoAtendimento() {
        return this.historicoAtendimentoIdhistoricoAtendimento;
    }
    
    public void setHistoricoAtendimentoIdhistoricoAtendimento(int historicoAtendimentoIdhistoricoAtendimento) {
        this.historicoAtendimentoIdhistoricoAtendimento = historicoAtendimentoIdhistoricoAtendimento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PacienteId) ) return false;
		 PacienteId castOther = ( PacienteId ) other; 
         
		 return (this.getIdPaciente()==castOther.getIdPaciente())
 && (this.getVacinaAplicadaIdVacinaAplicada()==castOther.getVacinaAplicadaIdVacinaAplicada())
 && (this.getVacinaAplicadaDoseIdDose()==castOther.getVacinaAplicadaDoseIdDose())
 && (this.getVacinaIdVacina()==castOther.getVacinaIdVacina())
 && (this.getVacinaEstoqueIdEstoque()==castOther.getVacinaEstoqueIdEstoque())
 && (this.getHistoricoAtendimentoIdhistoricoAtendimento()==castOther.getHistoricoAtendimentoIdhistoricoAtendimento());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPaciente();
         result = 37 * result + this.getVacinaAplicadaIdVacinaAplicada();
         result = 37 * result + this.getVacinaAplicadaDoseIdDose();
         result = 37 * result + this.getVacinaIdVacina();
         result = 37 * result + this.getVacinaEstoqueIdEstoque();
         result = 37 * result + this.getHistoricoAtendimentoIdhistoricoAtendimento();
         return result;
   }   


}


