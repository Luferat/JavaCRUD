package net.luferat.jcrud;

// Importa classes necess�rias
import java.util.Scanner;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.jcrud.ViewUser.ViewUser;
import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.Template.header;

public class EditUser {

    // Obt�m configura��es
    static Config c = new Config();

    public static void EditUser(int userId) {

        ClearConsole();
        header();

        // Interface tempor�ria
        System.out.println("Editando us�rio com Id " + userId + "...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();

        ViewUser(userId);
    }
}
