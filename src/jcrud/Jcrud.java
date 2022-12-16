package jcrud;
import java.sql.*;

public class Jcrud {
    public static Connection mysqlConnect(
            String hostname, // URL do servidor MySQL
            String database, // Nome do banco de dados
            String username, // Usuário desse banco de dados
            String password // Senha do usuário do banco de dados
    ) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Conecta a classe de banco de dados
            return DriverManager.getConnection( // Fazer a conexão com o banco de dados
                    "jdbc:mysql://" + hostname + ":3306/" + database, // String de conexão com o banco de dados
                    username, // Usuário desse banco de dados
                    password // Senha do usuário do banco de dados
            );
        } catch (Exception error) { // Tratamento de erros.
            System.out.println("Oooops! Erro no banco de dados! " + error);
            return null;
        }
    }

    // Método que executa o aplicativo
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
    }

}
