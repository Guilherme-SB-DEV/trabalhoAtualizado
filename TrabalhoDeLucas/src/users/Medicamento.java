package users;

public class Medicamento {
    private String nomeMedicamento;
    private String TipoMedicamento;
    private int duracaoTratamento;
    private int periodicidade;
    private int HorarioInicial;
    private float Dosagem;

    /**
     * @return the nomeMedicamento
     */
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    /**
     * @param nomeMedicamento the nomeMedicamento to set
     */
    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    /**
     * @return the TipoMedicamento
     */
    public String getTipoMedicamento() {
        return TipoMedicamento;
    }

    /**
     * @param TipoMedicamento the TipoMedicamento to set
     */
    public void setTipoMedicamento(String TipoMedicamento) {
        this.TipoMedicamento = TipoMedicamento;
    }

    /**
     * @return the duracaoTratamento
     */
    public int getDuracaoTratamento() {
        return duracaoTratamento;
    }

    /**
     * @param duracaoTratamento the duracaoTratamento to set
     */
    public void setDuracaoTratamento(int duracaoTratamento) {
        this.duracaoTratamento = duracaoTratamento;
    }

    /**
     * @return the periodicidade
     */
    public int getPeriodicidade() {
        return periodicidade;
    }

    /**
     * @param periodicidade the periodicidade to set
     */
    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    /**
     * @return the Dosagem
     */
    public float getDosagem() {
        return Dosagem;
    }

    /**
     * @param Dosagem the Dosagem to set
     */
    public void setDosagem(float Dosagem) {
        this.Dosagem = Dosagem;
    }

    /**
     * @return the HorarioInicial
     */
    public int getHorarioInicial() {
        return HorarioInicial;
    }

    /**
     * @param HorarioInicial the HorarioInicial to set
     */
    public void setHorarioInicial(int HorarioInicial) {
        this.HorarioInicial = HorarioInicial;
    }
}
