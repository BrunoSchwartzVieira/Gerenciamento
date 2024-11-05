package model.DTO;

import java.util.Date;

public class HistoricoUso {
    private Date dataIntervencao;
    private String descricao;
    private String pecasTrocadas;
    private int id;
    private int maquinaId;
    private Date dataInicio;
    private Date dataFim;
    private String usuario;

    // Construtor padrão
    public HistoricoUso() {
        // Inicializando os campos com valores padrão, se necessário
        this.dataIntervencao = new Date(); // data atual por padrão
        this.descricao = "";
        this.pecasTrocadas = "";
    }

    // Construtor com parâmetros para histórico de uso
    public HistoricoUso(Date dataIntervencao, String descricao, String pecasTrocadas) {
        this.dataIntervencao = dataIntervencao;
        this.descricao = descricao;
        this.pecasTrocadas = pecasTrocadas;
    }

    // Construtor para o gerenciamento de máquina
    public HistoricoUso(int id, int maquinaId, Date dataInicio, Date dataFim, String usuario) {
        this.id = id;
        this.maquinaId = maquinaId;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaquinaId() {
        return maquinaId;
    }

    public void setMaquinaId(int maquinaId) {
        this.maquinaId = maquinaId;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getDataIntervencao() {
        return dataIntervencao;
    }

    public void setDataIntervencao(Date dataIntervencao) {
        this.dataIntervencao = dataIntervencao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPecasTrocadas() {
        return pecasTrocadas;
    }

    public void setPecasTrocadas(String pecasTrocadas) {
        this.pecasTrocadas = pecasTrocadas;
    }
}
