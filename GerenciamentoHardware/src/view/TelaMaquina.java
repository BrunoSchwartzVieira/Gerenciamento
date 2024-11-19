
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaMaquina extends javax.swing.JPanel {

    private JFrame frame;
    private JTextField nomeField;
    private JTextField processadorField;
    private JTextField ramField;
    private JTextField armazenamentoField;
    private JTextField numeroSerieField;
    private JTextField dataAquisicaoField;
    private JTextField localizacaoField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    
    public TelaMaquina() {
        initComponents();
        
        frame = new JFrame("Cadastro de Máquinas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(9, 2)); // 9 linhas, 2 colunas

        // Criação dos campos de entrada
        nomeField = new JTextField();
        processadorField = new JTextField();
        ramField = new JTextField();
        armazenamentoField = new JTextField();
        numeroSerieField = new JTextField();
        dataAquisicaoField = new JTextField();
        localizacaoField = new JTextField();

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para adicionar uma máquina
                System.out.println("Adicionar máquina: " + nomeField.getText());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar máquinas
                System.out.println("Listar máquinas");
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // Adicionando os componentes ao frame
        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Processador:"));
        frame.add(processadorField);
        frame.add(new JLabel("RAM (GB):"));
        frame.add(ramField);
        frame.add(new JLabel("Armazenamento (GB):"));
        frame.add(armazenamentoField);
        frame.add(new JLabel("Número de Série:"));
        frame.add(numeroSerieField);
        frame.add(new JLabel("Data de Aquisição:"));
        frame.add(dataAquisicaoField);
        frame.add(new JLabel("Localização:"));
        frame.add(localizacaoField);
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }

    private void limparCampos() {
        nomeField.setText("");
        processadorField.setText("");
        ramField.setText("");
        armazenamentoField.setText("");
        numeroSerieField.setText("");
        dataAquisicaoField.setText("");
        localizacaoField.setText("");
        
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
