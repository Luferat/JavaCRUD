package net.luferat.database;

// Importa classes necess�rias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static net.luferat.tools.Config.*;

public class DbConnect {

    // M�todo para conex�o com o banco de dados.
    public static Connection DbConnect() {
        try {

            // Obt�m o driver do MySQL da bliblioteca
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Faz a conex�o com o banco de dados
            return DriverManager.getConnection(
                    // URL de conex�o com o banco de dados
                    "jdbc:mysql://" + HOSTNAME + ":3306/" + DATABASE,
                    // Usu�rio desse banco de dados
                    USERNAME,
                    // Senha do usu�rio do banco de dados
                    PASSWORD
            );
        } catch (ClassNotFoundException | SQLException error) { // Tratamento de erros.
            System.out.println("Oooops! Erro no banco de dados! " + error);
            
            // Em caso de erro, retorna null
            return null;
        }
    }

}
