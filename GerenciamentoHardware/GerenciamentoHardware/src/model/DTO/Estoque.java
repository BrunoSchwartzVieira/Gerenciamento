
package model.DTO;

import java.util.Date;

public class Estoque {
     private int id;
    private String nomeProduto;
    private int quantidade;
    private String categoria;
    private Date dataAdicao;

    // Construtor padrão
    public Estoque() {}

    // Construtor com parâmetros
    public Estoque(int id, String nomeProduto, int quantidade, String categoria, Date dataAdicao) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.dataAdicao = dataAdicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataAdicao() {
        return dataAdicao;
    }

    public void setDataAdicao(Date dataAdicao) {
        this.dataAdicao = dataAdicao;
    }
    
}
