package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Laboratorio;
import model.Maquina;
import model.Usuario;
import model.Peça;
import view.Maquinaview;
import view.laboratorioview;

public class Mainview extends javax.swing.JFrame {

    private JPanel mainPanel; // Painel principal com CardLayout
    private JPanel menuPanel; // Painel do menu lateral
    private Laboratorio laboratorioView;
    private Maquina maquinaView;
    private Usuario usuarioView;
    private Peça peçaView;

    public Mainview() {
       setTitle("Sistema de Gerenciamento de Hardware");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializar o painel principal que usa CardLayout
        mainPanel = new JPanel(new CardLayout());

        // Inicializar as views
        laboratorioview Laboratorioview = new laboratorioview(); 
        maquinaView Maquinaview = new maquinaview();         
        usuarioView = new UsuarioView();         
        peçaView = new PeçaView();
        
        // Adicionar os painéis ao mainPanel
        mainPanel.add(laboratorioView, "Laboratorio");
        mainPanel.add(maquinaView, "Maquina");
        mainPanel.add(usuarioView, "Usuario");
        mainPanel.add(peçaView, "Peça");

        // Inicializar o painel do menu
        menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setPreferredSize(new Dimension(200, getHeight()));

        // Criar botões para alternar entre as views
        JButton btnLaboratorio = createButton("Gerenciar Laboratórios", "Laboratorio");
        JButton btnMaquina = createButton("Gerenciar Máquinas", "Maquina");
        JButton btnUsuario = createButton("Gerenciar Usuários", "Usuario");
        JButton btnPeça = createButton("Gerenciar Peças", "Peça");

        // Adicionar os botões ao menuPanel
        menuPanel.add(btnLaboratorio);
        menuPanel.add(btnMaquina);
        menuPanel.add(btnUsuario);
        menuPanel.add(btnPeça);

        // Adicionar os painéis ao JFrame
        add(menuPanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    // Método para criar botões com ação
    private JButton createButton(String title, String panelName) {
        JButton button = new JButton(title);
        button.addActionListener(e -> showPanel(panelName));
        return button;
    }

    // Método para mostrar um painel específico
    public void showPanel(String panelName) {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, panelName);
    }
    @SuppressWarnings("unchecked")
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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainview().setVisible(true);
            }
        });
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables



