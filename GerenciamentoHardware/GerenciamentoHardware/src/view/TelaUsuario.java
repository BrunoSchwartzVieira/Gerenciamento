
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario extends javax.swing.JPanel {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField perfilField;
    private JPasswordField senhaField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;

    public TelaUsuario() {
        initComponents();
         frame = new JFrame("Cadastro de Usuários");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Criação dos campos de entrada
        nomeField = new JTextField();
        perfilField = new JTextField();
        senhaField = new JPasswordField();

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");

        // Ações dos botões
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para adicionar um usuário
                System.out.println("Adicionar usuário: " + nomeField.getText());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar usuários
                System.out.println("Listar usuários");
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
        frame.add(new JLabel("Perfil:"));
        frame.add(perfilField);
        frame.add(new JLabel("Senha:"));
        frame.add(senhaField);
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }

    private void limparCampos() {
        nomeField.setText("");
        perfilField.setText("");
        senhaField.setText("");
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
