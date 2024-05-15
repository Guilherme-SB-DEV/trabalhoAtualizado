package users;
import java.util.Date;
public class UsrPaciente extends Usr{

	private String descricaoNecessidades;
        private String senhaPaciente;
        private String ddd;
        private String numero;
        
        public String getDescricaoNecessidades() {
                return descricaoNecessidades;
        }
        public void setDescricaoNecessidades(String descricaoNecessidades) {
                this.descricaoNecessidades = descricaoNecessidades;
        }

        /**
         * @return the senhaPaciente
         */
        public String getSenhaPaciente() {
            return senhaPaciente;
        }

        /**
         * @param senhaPaciente the senhaPaciente to set
         */
        public void setSenhaPaciente(String senhaPaciente) {
            this.senhaPaciente = senhaPaciente;
        }


        /**
         * @return the ddd
         */
        public String getDdd() {
            return ddd;
        }

        /**
         * @param ddd the ddd to set
         */
        public void setDdd(String ddd) {
            this.ddd = ddd;
        }

        /**
         * @return the numero
         */
        public String getNumero() {
            return numero;
        }

        /**
         * @param numero the numero to set
         */
        public void setNumero(String numero) {
            this.numero = numero;
        }

    

   
	
}
