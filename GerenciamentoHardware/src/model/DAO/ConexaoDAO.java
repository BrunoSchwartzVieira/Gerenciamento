package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/GerenciametodeHardware2";
    private static final String USER = "root";      
    private static final String PASSWORD = "root";    

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
