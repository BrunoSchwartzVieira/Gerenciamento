
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class laboratorioview extends javax.swing.JPanel {
   private JFrame frame;
    private JTextField nomeField;
    private JTextField localizacaoField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    
    public laboratorioview() {
        initComponents();
         frame = new JFrame("Cadastro de Laboratório");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Criação dos campos de entrada
        nomeField = new JTextField();
        localizacaoField = new JTextField();

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para adicionar um laboratório
                System.out.println("Adicionar laboratório: " + nomeField.getText());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar laboratórios
                System.out.println("Listar laboratórios");
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
        frame.add(new JLabel("Localização:"));
        frame.add(localizacaoField);
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }

    private void limparCampos() {
        nomeField.setText("");
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
