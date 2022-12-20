package net.luferat.jcrud;

// Importa classes necessárias
import java.util.Scanner;
import static net.luferat.jcrud.ViewUser.ViewUser;
import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.Template.header;

public class DeleteUser {

    // Obtém configurações
    static Config c = new Config();

    public static void DeleteUser(int userId) {

        ClearConsole();
        header();

        // Interface temporária
        System.out.println("Apagando usuário com ID " + userId + "...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();

        ViewUser(userId);
    }

}
