package view;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import model.DAO.LaboratoriosDAO;
import model.DTO.Laboratorios;
import javax.swing.table.DefaultTableModel;

public class TelaLaboratorio extends JPanel {
    private JTextField nomeField;
    private JTextField localizacaoField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    private JFrame frame;
    private JTable tabelaLaboratorios;

    public TelaLaboratorio() {
        frame = new JFrame("Cadastro de Laboratório");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Painel de Formulário
        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(3, 2));
        
        nomeField = new JTextField();
        localizacaoField = new JTextField();
        
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        adicionarButton.addActionListener(e -> adicionarLaboratorio());
        listarButton.addActionListener(e -> listarLaboratorios());
        limparButton.addActionListener(e -> limparCampos());

        painelFormulario.add(new JLabel("Nome:"));
        painelFormulario.add(nomeField);
        painelFormulario.add(new JLabel("Localização:"));
        painelFormulario.add(localizacaoField);
        painelFormulario.add(adicionarButton);
        painelFormulario.add(listarButton);

        // Painel de Tabela
        tabelaLaboratorios = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabelaLaboratorios);
        
        // Configuração do painel da tabela
        JPanel painelTabela = new JPanel();
        painelTabela.setLayout(new BorderLayout());
        painelTabela.add(new JLabel("Lista de Laboratórios"), BorderLayout.NORTH);
        painelTabela.add(scrollPane, BorderLayout.CENTER);
        
        // Painel principal
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.add(painelFormulario, BorderLayout.NORTH);
        painelPrincipal.add(painelTabela, BorderLayout.CENTER);
        painelPrincipal.add(limparButton, BorderLayout.SOUTH);

        // Adicionando o painel principal ao frame
        frame.add(painelPrincipal, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void adicionarLaboratorio() {
    String nome = nomeField.getText();
    String localizacao = localizacaoField.getText();

    if (nome.isEmpty() || localizacao.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Preencha todos os campos.");
        return;
    }

    Laboratorios laboratorio = new Laboratorios();
    laboratorio.setNome(nome);
    laboratorio.setLocalizacao(localizacao);

    LaboratoriosDAO dao = new LaboratoriosDAO();
    boolean sucesso = dao.inserirLaboratorio(laboratorio); 

    if (sucesso) {
        JOptionPane.showMessageDialog(frame, "Laboratório adicionado com sucesso!");
        limparCampos(); // Limpar os campos após a inserção
    } else {
        JOptionPane.showMessageDialog(frame, "Erro ao adicionar laboratório.");
    }
}


    private void listarLaboratorios() {
        LaboratoriosDAO dao = new LaboratoriosDAO();
        List<Laboratorios> laboratorios = dao.listarLaboratorios();
        
        
        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("ID");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Localização");
        
        for (Laboratorios laboratorio : laboratorios) {
            modeloTabela.addRow(new Object[]{laboratorio.getId(), laboratorio.getNome(), laboratorio.getLocalizacao()});
        }
        
        tabelaLaboratorios.setModel(modeloTabela);
    }

    public void limparCampos() {
        nomeField.setText("");
        localizacaoField.setText("");
    }

   
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(frame, mensagem);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

