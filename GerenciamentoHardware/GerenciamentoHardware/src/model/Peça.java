
package model;


public class Peça {
    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private int quantidade;

    // Construtor
    public Peça(String nome, String tipo, String descricao, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Peça() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Peca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    
}
}