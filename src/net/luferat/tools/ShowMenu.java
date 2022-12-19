package net.luferat.tools;

// Importa classes necessárias
import java.sql.SQLException;
import java.util.Scanner;
import static net.luferat.jcrud.DeleteUser.DeleteUser;
import static net.luferat.jcrud.EditUser.EditUser;
import static net.luferat.jcrud.NewUser.NewUser;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.jcrud.ViewUser.ViewUser;
import static net.luferat.tools.Config.SEPARATOR;
import static net.luferat.tools.StopApp.StopApp;

public class ShowMenu {

    public static void mainMenu() throws SQLException {

        // Formata menu principal
        System.out.println("\n" + SEPARATOR + "\nMenu principal:\n");
        System.out.println("    0  - Cadastra novo usuário");
        System.out.println("    Id - Ver cadastro do usuário");
        System.out.println("    -1 - Sai do aplicativo");
        System.out.print("\nDigite uma opção: ");

        // Cria uma entrada de teclado para obter opção do menu
        Scanner myOption = new Scanner(System.in);

        // Recebe um número inteiro pelo teclado
        int option = myOption.nextInt();

        // Conforme a opção digitada
        switch (option) {

            // Encera aplicativo
            case -1:
                StopApp();
                break;

            // Cadastra novo usuário
            case 0:
                NewUser();
                break;

            // Lista dados do usuário
            default:
                ViewUser(option);
                break;
        }
    }

    public static void userMenu(int userId) throws SQLException {

        // Formata menu do usuário
        System.out.println("\n" + SEPARATOR + "\nMenu do usuário:\n");
        System.out.println("    0 - Volta para lista de usuários");
        System.out.println("    1 - Edita os dados do usuário");
        System.out.println("    99 - Apaga usuário do sistema");
        System.out.println("    -1 - Sai do aplicativo");
        System.out.print("\nDigite uma opção: ");

        // Cria uma entrada de teclado para obter opção do menu
        Scanner myOption = new Scanner(System.in);

        // Recebe um número inteiro pelo teclado
        int option = myOption.nextInt();

        // Conforme a opção digitada
        switch (option) {
            case 0:
                UsersList();
                break;
            case 1:
                EditUser(userId);
                break;
            case 99:
                DeleteUser(userId);
                break;
            default:
                StopApp();
                break;
        }
    }
}
