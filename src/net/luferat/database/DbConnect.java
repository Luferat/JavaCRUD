package net.luferat.database;

// Importa classes necess�rias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.luferat.tools.Config;

public class DbConnect {

    // Obt�m configura��es
    static Config config = new Config();
    
    // M�todo para conex�o com o banco de dados.
    public static Connection DbConnect() {
        try {

            // Obt�m o driver do MySQL da bliblioteca
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Faz a conex�o com o banco de dados
            return DriverManager.getConnection(
                    // URL de conex�o com o banco de dados
                    "jdbc:mysql://" + config.HOSTNAME + ":3306/" + config.DATABASE,
                    // Usu�rio desse banco de dados
                    config.USERNAME,
                    // Senha do usu�rio do banco de dados
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
