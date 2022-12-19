package jcrud;

import java.sql.*;

/*
 * Importa todas as classes do Conector MySQL.
 * Download: https://dev.mysql.com/downloads/connector/j/
 * Na listagem, selecione "Platform Independent", baixe a vers�o ".ZIP" e 
 * descompacte-a. Copie o arquivo "mysql-connector-XXXX.jar" para uma pasta 
 * "recources" dentro da pasta do projeto.
 * Clique direito em "Bibliotecas"
 * Adicionar JAR/Pasta...
 * Localize o arquivo do conector.
 */
public class Jcrud {

    // Dados de conex�o com o "nosso" MySQL do XAMMP
    private static final String HOSTNAME = "localhost";
    private static final String DATABASE = "jcrud";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    /*
     * M�todo para conex�o com o banco de dados.
     * Em breve, teremos uma classe somente para esse m�todo e outros 
     * relacionados ao MySQL.
     */
    public static Connection mysqlConnect(
            String hostname, // URL do servidor MySQL
            String database, // Nome do banco de dados
            String username, // Usu�rio desse banco de dados
            String password // Senha do usu�rio do banco de dados
    ) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Conecta a classe de banco de dados
            return DriverManager.getConnection( // Fazer a conex�o com o banco de dados
                    "jdbc:mysql://" + hostname + ":3306/" + database, // String (URL) de conex�o com o banco de dados
                    username, // Usu�rio desse banco de dados
                    password // Senha do usu�rio do banco de dados
            );
        } catch (Exception error) { // Tratamento de erros.
            System.out.println("Oooops! Erro no banco de dados! " + error);
            return null;
        }
    }

    // M�todo que executa o aplicativo
    public static void main(String[] args) throws SQLException {

        // Criar a vari�vel de conex�o
        Connection conn;

        // Realiza a conex�o com o "nosso" MySQL do XAMMP
        conn = mysqlConnect(HOSTNAME, DATABASE, USERNAME, PASSWORD);
        
        // Vari�vel que executa o comando SQL (statement)
        Statement stmt = conn.createStatement();
        
        // Vari�vel que armazena os dados que vieram do banco
        ResultSet res;
        
        // Executa a consulta SQL;
        res = stmt.executeQuery("SELECT * FROM users WHERE u_status = 'on';");
        
        // Exibe os dados dentro de "res", iterando com um loop
        while(res.next()) {
            System.out.println(
                    res.getInt("u_id") + ") "
                    + res.getString("u_name") + " | "
                    + res.getString("u_email") + " ("
                    + res.getString("u_password") + ");"
            );
        }
    }

}
