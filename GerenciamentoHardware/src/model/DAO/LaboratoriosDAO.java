package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DTO.Laboratorios;

public class LaboratoriosDAO {

    public void inserirLaboratorio(Laboratorios laboratorio) {
        String sql = "INSERT INTO laboratorios (nome, localizacao) VALUES (?, ?)";
        try (Connection conn = ConexaoDAO.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public List<Laboratorios> listarLaboratorios() {
        List<Laboratorios> laboratorios = new ArrayList<>();
        String sql = "SELECT * FROM laboratorios";
        try (Connection conn = ConexaoDAO.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Laboratorios laboratorio = new Laboratorios(
                        rs.getInt("id"), // Captura o id do resultado
                        rs.getString("nome"),
                        rs.getString("localizacao")
                );

                laboratorios.add(laboratorio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laboratorios;
    }

    public void atualizarLaboratorio(Laboratorios laboratorio) {
        String sql = "UPDATE laboratorios SET nome = ?, localizacao = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, laboratorio.getNome());
            stmt.setString(2, laboratorio.getLocalizacao());
            stmt.setInt(3, laboratorio.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerLaboratorio(int id) {
        String sql = "DELETE FROM laboratorios WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
