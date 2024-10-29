
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Laboratorio;

public class LaboratorioDAO {
    
     public void inserirLaboratorio(Laboratorio laboratorio) {
        String sql = "INSERT INTO laboratorio (nome, localizacao) VALUES (?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Laboratorio> listarLaboratorios() {
        List<Laboratorio> laboratorios = new ArrayList<>();
        String sql = "SELECT * FROM laboratorio";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                Laboratorio laboratorio = new Laboratorio(
                        rs.getString("nome"),
                        rs.getString("localizacao")
                );
                laboratorio.setId(rs.getInt("id"));
                laboratorios.add(laboratorio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laboratorios;
}
}
