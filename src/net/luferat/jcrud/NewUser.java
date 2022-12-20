package net.luferat.jcrud;

// Importa classes necessárias
import java.util.Scanner;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.Template.header;

public class NewUser {

    // Obtém configurações
    static Config c = new Config();

    public static void NewUser() {

        ClearConsole();
        header();

        // Interface temporária
        System.out.println("Cadastrando novo usuário...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();

        UsersList();
    }

}
