package users;
import java.util.Date;
public class UsrCuidador extends Usr{
        private String TipoContrato;
	private String descricaoEspecialidade;
	private String dddEmergencial;
	private String numeroEmergencial;
        private String periodo;
        private String senhaCuidador;
        
	
	public String getDescricaoEspecialidade() {
		return descricaoEspecialidade;
	}
	public void setDescricaoEspecialidade(String descricaoEspecialidade) {
		this.descricaoEspecialidade = descricaoEspecialidade;
	}
	public String getDddEmergencial() {
		return dddEmergencial;
	}
	public void setDddEmergencial(String dddEmergencial) {
		this.dddEmergencial = dddEmergencial;
	}
	public String getNumeroEmergencial() {
		return numeroEmergencial;
	}
	public void setNumeroEmergencial(String numeroEmergencial) {
		this.numeroEmergencial = numeroEmergencial;
	}


        public String getPeriodo() {
            return periodo;
        }

        public void setPeriodo(String periodo) {
            this.periodo = periodo;
        }

    /**
     * @return the TipoContrato
     */
    public String getTipoContrato() {
        return TipoContrato;
    }

    /**
     * @param TipoContrato the TipoContrato to set
     */
    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    /**
     * @return the senha
     */
    public String getSenhaCuidador() {
        return senhaCuidador;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenhaCuidador(String senha) {
        this.senhaCuidador = senha;
    }
	
	
	

}
