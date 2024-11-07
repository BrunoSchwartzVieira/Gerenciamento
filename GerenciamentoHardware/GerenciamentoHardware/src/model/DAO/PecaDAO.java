package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DTO.Peca;

public class PecaDAO {

    public void inserirPeca(Peca peca) {
        String sql = "INSERT INTO peca (nome, tipo, descricao, quantidade, caminho_imagem) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, peca.getNome());
            stmt.setString(2, peca.getTipo());
            stmt.setString(3, peca.getDescricao());
            stmt.setInt(4, peca.getQuantidade());
            stmt.setString(5, peca.getCaminhoImagem()); // Adicionado caminhoImagem

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Considere usar um logger
        }
    }

    public List<Peca> listarPecas() {
        List<Peca> pecas = new ArrayList<>();
        String sql = "SELECT * FROM peca";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Peca peca = new Peca(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getString("descricao"),
                        rs.getInt("quantidade"),
                        rs.getString("caminho_imagem") // Corrigido para refletir a coluna correta
                );
                pecas.add(peca);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Considere usar um logger
        }

        return pecas;
    }
}
