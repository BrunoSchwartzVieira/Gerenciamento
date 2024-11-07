
package model.DAO;

import model.DTO.HistoricoUso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoUsoDAO {
    
    private Connection conexao;

    public HistoricoUsoDAO(Connection conexao) {
        this.conexao = conexao;
    }

     public void salvarHistorico(HistoricoUso historico, int maquinaId) throws SQLException {
    String sql = "INSERT INTO historico_uso (maquina_id, data_intervencao, descricao, pecas_trocadas) VALUES (?, ?, ?, ?)";
    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, maquinaId);
    stmt.setDate(2, new java.sql.Date(historico.getDataIntervencao().getTime()));
    stmt.setString(3, historico.getDescricao());
    stmt.setString(4, historico.getPecasTrocadas());
    stmt.executeUpdate();
}

public void atualizarHistorico(HistoricoUso historico, int historicoId) throws SQLException {
    String sql = "UPDATE historico_uso SET data_intervencao = ?, descricao = ?, pecas_trocadas = ? WHERE id = ?";
    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setDate(1, new java.sql.Date(historico.getDataIntervencao().getTime()));
    stmt.setString(2, historico.getDescricao());
    stmt.setString(3, historico.getPecasTrocadas());
    stmt.setInt(4, historicoId);
    stmt.executeUpdate();
}

public void deletarHistorico(int historicoId) throws SQLException {
    String sql = "DELETE FROM historico_uso WHERE id = ?";
    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, historicoId);
    stmt.executeUpdate();
}

public List<HistoricoUso> listarHistorico(int maquinaId) throws SQLException {
    List<HistoricoUso> historicos = new ArrayList<>();
    String sql = "SELECT * FROM historico_uso WHERE maquina_id = ?";
    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, maquinaId);
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
        HistoricoUso historico = new HistoricoUso(
            rs.getDate("data_intervencao"),
            rs.getString("descricao"),
            rs.getString("pecas_trocadas")
        );
        historicos.add(historico);
    }
    return historicos;
}

    
}

    
