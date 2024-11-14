package model.DTO;

public class Maquina {
    private int id;
    private String numeroSerie;
    private String processador;
    private String ram;
    private String armazenamento;
    private String dataAquisicao;
    private String localizacao;
    private String status;
    private int laboratorioId;

    // Construtor
    public Maquina(String numeroSerie, String processador, String ram, String armazenamento,
                   String dataAquisicao, String localizacao, String status, int laboratorioId) {
        this.numeroSerie = numeroSerie;
        this.processador = processador;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.dataAquisicao = dataAquisicao;
        this.localizacao = localizacao;
        this.status = status;
        this.laboratorioId = laboratorioId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLaboratorioId() {
        return laboratorioId;
    }

    public void setLaboratorioId(int laboratorioId) {
        this.laboratorioId = laboratorioId;
    }

    // Método toString para exibir informações da máquina
    @Override
    public String toString() {
        return "Maquina{" +
                "id=" + id +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", processador='" + processador + '\'' +
                ", ram='" + ram + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", dataAquisicao='" + dataAquisicao + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", status='" + status + '\'' +
                ", laboratorioId=" + laboratorioId +
                '}';
    }
}
