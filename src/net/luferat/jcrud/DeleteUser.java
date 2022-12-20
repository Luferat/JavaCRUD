package net.luferat.jcrud;

// Importa classes necess�rias
import java.util.Scanner;
import static net.luferat.jcrud.ViewUser.ViewUser;
import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.Template.header;

public class DeleteUser {

    // Obt�m configura��es
    static Config c = new Config();

    public static void DeleteUser(int userId) {

        ClearConsole();
        header();

        // Interface tempor�ria
        System.out.println("Apagando usu�rio com ID " + userId + "...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();

        ViewUser(userId);
    }

}
