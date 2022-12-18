package net.luferat.jcrud;

// Importa classes necessárias
import java.sql.SQLException;
import java.util.Scanner;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.tools.ClearConsole.ClearConsole;
import static net.luferat.tools.Config.APPNAME;

public class EditUser {

    public static void EditUser(int userId) throws SQLException {

        // Limpa tela
        ClearConsole();

        // Interface temporária
        System.out.println(APPNAME);
        System.out.println("Editando usário com Id " + userId + "...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();
        UsersList();
    }
}
