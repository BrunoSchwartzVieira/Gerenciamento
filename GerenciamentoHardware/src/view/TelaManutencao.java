package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaManutencao extends JFrame {
    private JTextField maquinaField;
    private JTextField dataManutencaoField;
    private JTextField tecnicoField;
    private JTextArea diagnosticoArea;
    private JTextArea solucaoArea;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;

    public TelaManutencao() {
        // Configurações da janela
        setTitle("Gerenciar Manutenções");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setLayout(new GridLayout(7, 2, 10, 10)); // Layout 7x2 com espaçamento

        // Criando os campos de entrada
        maquinaField = new JTextField();
        dataManutencaoField = new JTextField();
        tecnicoField = new JTextField();
        diagnosticoArea = new JTextArea(3, 20);
        solucaoArea = new JTextArea(3, 20);

        // Criando os botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para adicionar uma manutenção
                System.out.println("Adicionar manutenção para: " + maquinaField.getText());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar manutenções
                System.out.println("Listar manutenções");
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // Adicionando os componentes ao frame
        add(new JLabel("Máquina:"));
        add(maquinaField);
        add(new JLabel("Data da Manutenção:"));
        add(dataManutencaoField);
        add(new JLabel("Técnico Responsável:"));
        add(tecnicoField);
        add(new JLabel("Diagnóstico:"));
        add(new JScrollPane(diagnosticoArea)); // Adicionando com barra de rolagem
        add(new JLabel("Solução:"));
        add(new JScrollPane(solucaoArea)); // Adicionando com barra de rolagem
        add(adicionarButton);
        add(listarButton);
        add(limparButton);

        // Tornar a janela visível
        setVisible(true);
    }

    private void limparCampos() {
        maquinaField.setText("");
        dataManutencaoField.setText("");
        tecnicoField.setText("");
        diagnosticoArea.setText("");
        solucaoArea.setText("");
    }

    public static void main(String[] args) {
        new TelaManutencao(); // Inicia a Tela de Manutenção
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
