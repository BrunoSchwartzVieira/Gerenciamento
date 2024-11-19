package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JButton usuarioButton;
    private JButton laboratorioButton;
    private JButton maquinaButton;
    private JButton manutencaoButton;
    private JButton sairButton;

    public TelaPrincipal() {
        // Configurações da janela
        setTitle("Tela Principal - Gerenciador de Hardware");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // Layout 3x2 com espaçamento

        // Criando os botões para as outras telas
        usuarioButton = new JButton("Gerenciar Usuários");
        laboratorioButton = new JButton("Gerenciar Laboratórios");
        maquinaButton = new JButton("Gerenciar Máquinas");
        manutencaoButton = new JButton("Gerenciar Manutenções");
        sairButton = new JButton("Sair");

        // Ações dos botões
        usuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaUsuario(); // Abre a Tela de Usuários
            }
        });

        laboratorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaLaboratorio(); // Abre a Tela de Laboratórios
            }
        });

        maquinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMaquina(); // Abre a Tela de Máquinas
            }
        });

        manutencaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaManutencao(); // Abre a Tela de Manutenções
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha a aplicação
            }
        });

        // Adicionando os botões ao frame
        add(usuarioButton);
        add(laboratorioButton);
        add(maquinaButton);
        add(manutencaoButton);
        add(sairButton);

        // Tornar a janela visível
        setVisible(true);
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

