package model;

public class Laboratorio {
    private int id;
    private String nome;
    private String localizacao;

    // Construtor
    public Laboratorio(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters e Setters
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}