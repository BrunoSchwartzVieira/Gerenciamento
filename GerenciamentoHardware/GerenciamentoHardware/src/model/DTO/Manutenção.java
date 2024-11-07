
package model.DTO;

import java.sql.Date;


public class Manutenção {
    private int id;
    private String descricao;
    private Date data;
    private double custo;
    private String responsavel;

    // Construtor padrão
    public Manutenção() {}

    // Construtor com parâmetros
    public Manutenção(int id, String descricao, Date data, double custo, String responsavel) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.custo = custo;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    

}
