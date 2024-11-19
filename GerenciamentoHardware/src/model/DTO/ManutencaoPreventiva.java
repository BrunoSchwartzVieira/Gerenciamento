package model.DTO;

import java.util.Date;

public class ManutencaoPreventiva {
    private int id;
    private int maquinaId;
    private Date dataAgendamento;
    private String descricao;
    private boolean concluido;

    
    public ManutencaoPreventiva() {}

    
    public ManutencaoPreventiva(int id, int maquinaId, Date dataAgendamento, String descricao, boolean concluido) {
        this.id = id;
        this.maquinaId = maquinaId;
        this.dataAgendamento = dataAgendamento;
        this.descricao = descricao;
        this.concluido = concluido;
    }

    
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

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
