
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Maquina;


public class MaquinaDAO {
    public void inserirMaquina(Maquina maquina) {
        String sql = "INSERT INTO maquina (numero_serie, processador, ram, armazenamento, data_aquisicao, localizacao, status, laboratorio_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, maquina.getNumeroSerie());
            stmt.setString(2, maquina.getProcessador());
            stmt.setString(3, maquina.getRam());
            stmt.setString(4, maquina.getArmazenamento());
            stmt.setString(5, maquina.getDataAquisicao());
            stmt.setString(6, maquina.getLocalizacao());
            stmt.setString(7, maquina.getStatus());
            stmt.setInt(8, maquina.getLaboratorioId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     public List<Maquina> listarMaquinas() {
        List<Maquina> maquinas = new ArrayList<>();
        String sql = "SELECT * FROM maquina";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
             
            while (rs.next()) {
                Maquina maquina = new Maquina(
                        rs.getString("numero_serie"),
                        rs.getString("processador"),
                        rs.getString("ram"),
                        rs.getString("armazenamento"),
                        rs.getString("data_aquisicao"),
                        rs.getString("localizacao"),
                        rs.getString("status"),
                        rs.getInt("laboratorio_id")
                );
                maquina.setId(rs.getInt("id"));
                maquinas.add(maquina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maquinas;
}
}

