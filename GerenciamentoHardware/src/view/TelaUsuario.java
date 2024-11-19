
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario extends JFrame {
    private JTextField nomeField;
    private JTextField perfilField;
    private JPasswordField senhaField;
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;

    public TelaUsuario() {
        // Configurações da janela
        setTitle("Cadastro de Usuários");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10)); // GridLayout com espaçamento

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
                // Você pode chamar um método de inserção no banco aqui
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar usuários
                System.out.println("Listar usuários");
                // Chame aqui o método que lista os usuários do banco
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // Adicionando os componentes ao frame
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Perfil:"));
        add(perfilField);
        add(new JLabel("Senha:"));
        add(senhaField);
        add(adicionarButton);
        add(listarButton);
        add(limparButton);

        // Tornar a janela visível
        setVisible(true);
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
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

