package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.DAO.PecaDAO; // Importe o DAO
import model.DTO.Peca; // Importe o modelo

public class PecaView extends JPanel {
    private JFrame frame;
    private JTextField tipoField;
    private JTextField fabricanteField;
    private JTextField numeroSerieField;
    private JTextField quantidadeField;
    private JTextField imagemField; // Campo para o caminho da imagem
    private JButton adicionarButton;
    private JButton listarButton;
    private JButton limparButton;
    private JButton selecionarImagemButton; // Botão para selecionar imagem
    private String caminhoImagem; // Armazenar o caminho da imagem
    private PecaDAO peçaDAO; // Referência ao DAO

    public PecaView() {
        peçaDAO = new PecaDAO(); // Inicialize com sua conexão se necessário
        initComponents();
        
        frame = new JFrame("Cadastro de Peças");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2)); // Ajuste para 7 linhas

        // Criação dos campos de entrada
        tipoField = new JTextField();
        fabricanteField = new JTextField();
        numeroSerieField = new JTextField();
        quantidadeField = new JTextField();
        imagemField = new JTextField(); // Inicializa o campo da imagem

        // Criação dos botões
        adicionarButton = new JButton("Adicionar");
        listarButton = new JButton("Listar");
        limparButton = new JButton("Limpar");
        selecionarImagemButton = new JButton("Selecionar Imagem"); // Botão para selecionar imagem

        // Ações dos botões
        selecionarImagemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int retorno = fileChooser.showOpenDialog(null);
                if (retorno == JFileChooser.APPROVE_OPTION) {
                    caminhoImagem = fileChooser.getSelectedFile().getAbsolutePath();
                    imagemField.setText(caminhoImagem); // Atualiza o campo de texto
                }
            }
        });

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    adicionarPeça();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao adicionar peça: " + ex.getMessage());
                }
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarPeças();
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
        frame.add(selecionarImagemButton); // Adiciona o botão de seleção de imagem
        frame.add(imagemField); // Adiciona o campo da imagem
        frame.add(adicionarButton);
        frame.add(listarButton);
        frame.add(limparButton);

        frame.setVisible(true);
    }

    private void adicionarPeça() throws Exception {
        String tipo = tipoField.getText();
        String fabricante = fabricanteField.getText();
        String numeroSerie = numeroSerieField.getText();
        int quantidade = Integer.parseInt(quantidadeField.getText());
        
        // Cria um novo objeto Peça
        Peca novaPeça = new Peca(0, fabricante, tipo, numeroSerie, quantidade, caminhoImagem);
        peçaDAO.inserirPeca(novaPeça); // Adiciona a peça ao banco
        JOptionPane.showMessageDialog(frame, "Peça adicionada com sucesso!");
        limparCampos(); // Limpa os campos após a adição
    }

    private void listarPeças() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Peca peca : peçaDAO.listarPecas()) {
                sb.append(peca.formatarParaExibicao()).append("\n"); // Usa o método de formatação
            }
            JOptionPane.showMessageDialog(frame, sb.toString(), "Lista de Peças", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao listar peças: " + ex.getMessage());
        }
    }

    private void limparCampos() {
        tipoField.setText("");
        fabricanteField.setText("");
        numeroSerieField.setText("");
        quantidadeField.setText("");
        imagemField.setText(""); // Limpa o campo da imagem
        caminhoImagem = null; // Reseta o caminho da imagem
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

