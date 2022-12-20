package net.luferat.database;

// Importa classes necessárias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.luferat.tools.Config;

public class DbConnect {

    // Obtém configurações
    static Config config = new Config();
    
    // Método para conexão com o banco de dados.
    public static Connection DbConnect() {
        try {

            // Obtém o driver do MySQL da bliblioteca
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Faz a conexão com o banco de dados
            return DriverManager.getConnection(
                    // URL de conexão com o banco de dados
                    "jdbc:mysql://" + config.HOSTNAME + ":3306/" + config.DATABASE,
                    // Usuário desse banco de dados
                    config.USERNAME,
                    // Senha do usuário do banco de dados
                    config.PASSWORD
            );
        } catch (ClassNotFoundException | SQLException error) { // Tratamento de erros.

            String methodName = new Object() {
            }.getClass().getEnclosingMethod().getName();

            System.out.println("Oooops! Erro em " + methodName + ":  " + error.getMessage());

            // Em caso de erro, retorna null
            return null;
        }
    }

}
