package net.luferat.jcrud;

// Importa classes necessárias
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import static net.luferat.database.DbConnect.DbConnect;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.tools.ClearConsole.ClearConsole;
import static net.luferat.tools.ShowMenu.userMenu;
import static net.luferat.tools.Template.header;

public class ViewUser {

    // Atributos da classe
    private static String sql;
    private static ResultSet res;

    public static void ViewUser(int userId) {
        
        ClearConsole();
        header();

        // Query de obtém todos os dados do usuário
        sql = "SELECT *, DATE_FORMAT(u_date, '%d/%m/%Y às %H:%i') AS datebr FROM users WHERE u_status = 'on' AND u_id = '" + (int) userId + "';";

        try {
            // Executa a consulta SQL e armazena resultados em "res"
            res = DbConnect().createStatement().executeQuery(sql);

            // Se obteve um registro...
            if (res.next()) {

                // Obtém o Id do usuário
                userId = res.getInt("u_id");

                // Exibe os dados do usuário
                System.out.println(res.getString("u_name") + "\n");
                System.out.println("    - ID no sistema: " + userId);
                System.out.println("    - E-mail: " + res.getString("u_email"));
                System.out.println("    - Cadastrado em: " + res.getString("datebr"));

                // Fecha conexão com banco de dados
                DbConnect().close();

                // Menu de opções
                userMenu(userId);

                // Se não achou o registro
            } else {

                // Feedback e opção de saída
                System.out.println("Usuário não encontrado. Tente novamente!");
                System.out.println("Tecle [Enter] para retornar: ");
                Scanner myOption = new Scanner(System.in);
                String option = myOption.nextLine();

                // Volta a listar todos os usuários
                UsersList();
            }

        } catch (SQLException error) {
            String methodName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            System.out.println("Oooops! Erro em " + methodName + ":  " + error.getMessage());
        }
    }
}
