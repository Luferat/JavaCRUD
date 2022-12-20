package net.luferat.jcrud;

// Importa classes necess�rias
import java.util.Scanner;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.Template.header;

public class NewUser {

    // Obt�m configura��es
    static Config c = new Config();

    public static void NewUser() {

        ClearConsole();
        header();

        // Interface tempor�ria
        System.out.println("Cadastrando novo usu�rio...");
        System.out.println("Tecle [Enter] para retornar: ");
        Scanner myOption = new Scanner(System.in);
        String option = myOption.nextLine();

        UsersList();
    }

}
