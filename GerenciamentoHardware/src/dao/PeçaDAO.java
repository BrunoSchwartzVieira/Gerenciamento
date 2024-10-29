
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Peça;

public class PeçaDAO {
    
     public void inserirPeca(Peça peça) {
        String sql = "INSERT INTO peca (nome, tipo, descricao, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, peça.getNome());
            stmt.setString(2, peça.getTipo());
            stmt.setString(3, peça.getDescricao());
            stmt.setInt(4, peça.getQuantidade());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Peça> listarPeças() {
        List<Peça> pecas = new ArrayList<>();
        String sql = "SELECT * FROM peca";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                Peça peca = new Peça(
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getString("descricao"),
                        rs.getInt("quantidade")
                );
                peca.setId(rs.getInt("id"));
                pecas.add(peca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return pecas;
}
}
