package model.DTO;

public class Peca {
    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private int quantidade;
    private String caminhoImagem;

    // Construtor com todos os atributos, incluindo o id e o caminho da imagem
    public Peca(int id, String nome, String tipo, String descricao, int quantidade, String caminhoImagem) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.caminhoImagem = caminhoImagem;
    }

    // Construtor com parâmetros apenas para nome, tipo, descrição e quantidade
    public Peca(String nome, String tipo, String descricao, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.caminhoImagem = null; // Inicializa caminhoImagem como null
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

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    
    
    @Override
    public String toString() {
        return "Peca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", caminhoImagem='" + caminhoImagem + '\'' +
                '}';
    }
    
public String formatarParaExibicao() {
        return String.format("Nome: %s | Quantidade: %d", nome, quantidade);
    }
    
    }

    

