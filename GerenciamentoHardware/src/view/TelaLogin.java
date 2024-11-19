package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField usuarioField;
    private JPasswordField senhaField;
    private JButton loginButton;
    private JButton sairButton;

    public TelaLogin() {
        // Configurações da janela
        setTitle("Login - Gerenciador de Hardware");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // Layout 3x2 com espaçamento

        // Criando os campos de entrada
        usuarioField = new JTextField();
        senhaField = new JPasswordField();

        // Criando os botões
        loginButton = new JButton("Login");
        sairButton = new JButton("Sair");

        // Ação para o botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String senha = new String(senhaField.getPassword());

                // Autenticação com usuário e senha "root"
                if (autenticarUsuario(usuario, senha)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    new TelaPrincipal(); // Abre a Tela Principal
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ação para o botão sair
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });

        // Adicionando os componentes ao frame
        add(new JLabel("Usuário:"));
        add(usuarioField);
        add(new JLabel("Senha:"));
        add(senhaField);
        add(loginButton);
        add(sairButton);

        // Tornar a janela visível
        setVisible(true);
    }

    // Método de autenticação atualizado
    private boolean autenticarUsuario(String usuario, String senha) {
        // Validando se o usuário e a senha são "root"
        return "root".equals(usuario) && "root".equals(senha);
    }

    public static void main(String[] args) {
        new TelaLogin(); // Inicia a Tela de Login
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


