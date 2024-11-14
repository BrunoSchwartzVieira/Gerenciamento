package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/gerenciamentohardware";
    private static final String USER = "root";      // Substitua "seu_usuario" pelo nome de usuário do MySQL
    private static final String PASSWORD = "root";    // Substitua "sua_senha" pela senha do MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
        } catch (SQLException e) {
            System.err.println("Falha ao conectar ao banco de dados.");
            e.printStackTrace();
        }
        return connection;
    }
}
