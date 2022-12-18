package net.luferat.database;

// Importa classes necessárias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static net.luferat.tools.Config.*;

public class DbConnect {

    // Método para conexão com o banco de dados.
    public static Connection DbConnect() {
        try {

            // Obtém o driver do MySQL da bliblioteca
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Faz a conexão com o banco de dados
            return DriverManager.getConnection(
                    // URL de conexão com o banco de dados
                    "jdbc:mysql://" + HOSTNAME + ":3306/" + DATABASE,
                    // Usuário desse banco de dados
                    USERNAME,
                    // Senha do usuário do banco de dados
                    PASSWORD
            );
        } catch (ClassNotFoundException | SQLException error) { // Tratamento de erros.
            System.out.println("Oooops! Erro no banco de dados! " + error);
            
            // Em caso de erro, retorna null
            return null;
        }
    }

}
