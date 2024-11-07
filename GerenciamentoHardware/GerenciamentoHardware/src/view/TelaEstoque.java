
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEstoque extends javax.swing.JPanel {
    
    private JFrame frame;
    private JTextField tipoField;
    private JTextField fabricanteField;
    private JTextField numeroSerieField;
    private JTextField quantidadeField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    
    public TelaEstoque() {
        initComponents();
        frame = new JFrame("Cadastro de Estoque");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Criação dos campos de entrada
        tipoField = new JTextField();
        fabricanteField = new JTextField();
        numeroSerieField = new JTextField();
        quantidadeField = new JTextField();

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para adicionar uma peça ao estoque
                System.out.println("Adicionar peça ao estoque: " + tipoField.getText());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar peças do estoque
                System.out.println("Listar peças do estoque");
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // Adicionando os componentes ao frame
        frame.add(new JLabel("Tipo:"));
        frame.add(tipoField);
        frame.add(new JLabel("Fabricante:"));
        frame.add(fabricanteField);
        frame.add(new JLabel("Número de Série:"));
        frame.add(numeroSerieField);
        frame.add(new JLabel("Quantidade:"));
        frame.add(quantidadeField);
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }

    private void limparCampos() {
        tipoField.setText("");
        fabricanteField.setText("");
        numeroSerieField.setText("");
        quantidadeField.setText("");
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
