package net.luferat.jcrud;

// Importa classes necess�rias
import java.sql.ResultSet;
import java.sql.SQLException;
import static net.luferat.database.DbConnect.DbConnect;
import static net.luferat.tools.ClearConsole.ClearConsole;
import static net.luferat.tools.ShowMenu.mainMenu;
import static net.luferat.tools.Template.header;

public class UsersList {

    // Atributos da classe
    private static String sql;
    private static ResultSet res;

    public static void UsersList() {

        // Limpa tela
        ClearConsole();

        // Exibe cabe�alho
        header();

        // Query que ot�m o total de usu�rios ativos
        sql = "SELECT COUNT(u_id) AS total FROM users WHERE u_status = 'on';";

        try {

            // Executa a consulta SQL e armazena resultados em "res"
            res = DbConnect().createStatement().executeQuery(sql);

            // Obt�m dados de "res"
            res.next();

            // Sa�da
            System.out.println("Listando " + res.getInt("total") + " usu�rios ativos:\n");

            // Query que obt�m todos os usu�rios ativos
            sql = "SELECT * FROM users WHERE u_status = 'on';";

            // Executa a consulta SQL e armazena resultados em "res"
            res = DbConnect().createStatement().executeQuery(sql);

            // Itera dados de "res"
            while (res.next()) {
                System.out.println("    " + res.getInt("u_id") + ") " + res.getString("u_name"));
            }

            // Fecha a conex�o com o banco de dados
            DbConnect().close();

        } catch (SQLException error) {
            String methodName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            System.out.println("Oooops! Erro em " + methodName + ":  " + error.getMessage());
        }

        // Menu de op��es
        mainMenu();
    }
}
