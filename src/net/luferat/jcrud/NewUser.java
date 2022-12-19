package net.luferat.jcrud;

// Importa classes necess�rias
import java.sql.SQLException;
import java.util.Scanner;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.tools.ClearConsole.ClearConsole;
import static net.luferat.tools.Config.APPNAME;

public class NewUser {

    public static void NewUser() throws SQLException {

        // Limpa tela
        ClearConsole();

        // Interface tempor�ria
        System.out.println(APPNAME);
        System.out.println("Cadastrando novo usu�rio...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();
        UsersList();
    }

}
