package view;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import model.DTO.Laboratorio;

public class TelaLaboratorio extends JPanel {
    private JTextField nomeField;
    private JTextField localizacaoField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    private JFrame frame;

    public TelaLaboratorio() {
        // Configurações do JFrame
        frame = new JFrame("Cadastro de Laboratório");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Criação dos campos de entrada
        nomeField = new JTextField();
        localizacaoField = new JTextField();

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(e -> adicionarLaboratorio());
        listarButton.addActionListener(e -> listarLaboratorios());
        limparButton.addActionListener(e -> limparCampos());

        // Adicionando os componentes ao frame
        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Localização:"));
        frame.add(localizacaoField);
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }
     public JTextField getNomeField() {
        return nomeField;
    }

    public JTextField getLocalizacaoField() {
        return localizacaoField;
    }

    public JButton getAdicionarButton() {
        return adicionarButton;
    }

    public JButton getListarButton() {
        return listarButton;
    }

    public JButton getLimparButton() {
        return limparButton;
    }

    public void limparCampos() {
        nomeField.setText("");
        localizacaoField.setText("");
    }

    // Método para exibir uma mensagem
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(frame, mensagem);
    }

    // Método para exibir a lista de laboratórios
    public void exibirLaboratorios(List<Laboratorio> laboratorios) {
        StringBuilder sb = new StringBuilder("Laboratórios:\n");
        for (Laboratorio laboratorio : laboratorios) {
            sb.append(laboratorio.toString()).append("\n");
        }
        exibirMensagem(sb.toString());
    }

    private void adicionarLaboratorio() {
        String nome = nomeField.getText();
        String localizacao = localizacaoField.getText();
        // Aqui você deve chamar o método de inserção no banco
        System.out.println("Adicionar laboratório: " + nome + ", Localização: " + localizacao);
        // Adicione lógica para inserir no banco de dados
    }

    private void listarLaboratorios() {
        // Aqui você deve chamar o método de listagem dos laboratórios
        System.out.println("Listar laboratórios");
        // Adicione lógica para listar laboratórios
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

