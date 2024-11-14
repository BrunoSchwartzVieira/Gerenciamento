package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JPanel {

    private JPanel mainPanel; 
    private TelaLaboratorio telaLaboratorio;
    private TelaMaquina telaMaquina;
    private TelaUsuario telaUsuario;
   

    public TelaPrincipal() {
        setLayout(new BorderLayout());

        mainPanel = new JPanel(new CardLayout());

        telaLaboratorio = new TelaLaboratorio();
        telaMaquina = new TelaMaquina();
        telaUsuario = new TelaUsuario();
        

        mainPanel.add(telaLaboratorio, "Laboratorio");
        mainPanel.add(telaMaquina, "Maquina");
        mainPanel.add(telaUsuario, "Usuario");
        

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1)); // Configura 4 botões em uma única coluna

        JButton btnLaboratorio = createButton("Gerenciar Laboratórios", "Laboratorio");
        JButton btnMaquina = createButton("Gerenciar Máquinas", "Maquina");
        JButton btnUsuario = createButton("Gerenciar Usuários", "Usuario");
        JButton btnPeca = createButton("Gerenciar Peças", "Peça");

        menuPanel.add(btnLaboratorio);
        menuPanel.add(btnMaquina);
        menuPanel.add(btnUsuario);
        menuPanel.add(btnPeca);

        add(menuPanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JButton createButton(String title, String panelName) {
        JButton button = new JButton(title);
        button.addActionListener(e -> showPanel(panelName));
        return button;
    }

    public void showPanel(String panelName) {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, panelName);
    }

    public TelaLaboratorio getTelaLaboratorio() {
        return telaLaboratorio;
    }

    public TelaMaquina getTelaMaquina() {
        return telaMaquina;
    }

    public TelaUsuario getTelaUsuario() {
        return telaUsuario;
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
