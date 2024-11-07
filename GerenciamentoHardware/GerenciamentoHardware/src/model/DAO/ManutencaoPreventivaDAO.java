package model.DAO;

import model.DTO.ManutencaoPreventiva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManutencaoPreventivaDAO {
    private Connection conexao;

    public ManutencaoPreventivaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void agendarManutencao(ManutencaoPreventiva manutencao) throws SQLException {
        String sql = "INSERT INTO manutencao_preventiva (maquina_id, data_agendamento, descricao, concluido) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, manutencao.getMaquinaId());
        stmt.setDate(2, new java.sql.Date(manutencao.getDataAgendamento().getTime()));
        stmt.setString(3, manutencao.getDescricao());
        stmt.setBoolean(4, manutencao.isConcluido());
        stmt.executeUpdate();
    }

    public List<ManutencaoPreventiva> listarManutencoes(int maquinaId) throws SQLException {
        List<ManutencaoPreventiva> manutencoes = new ArrayList<>();
        String sql = "SELECT * FROM manutencao_preventiva WHERE maquina_id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, maquinaId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ManutencaoPreventiva manutencao = new ManutencaoPreventiva(
                rs.getInt("id"),
                rs.getInt("maquina_id"),
                rs.getDate("data_agendamento"),
                rs.getString("descricao"),
                rs.getBoolean("concluido")
            );
            manutencoes.add(manutencao);
        }
        return manutencoes;
    }
    
    public void concluirManutencao(int id) throws SQLException {
        String sql = "UPDATE manutencao_preventiva SET concluido = true WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}
