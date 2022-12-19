package net.luferat.tools;

// Importa classes necess�rias
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
        System.out.println("    0  - Cadastra novo usu�rio");
        System.out.println("    Id - Ver cadastro do usu�rio");
        System.out.println("    -1 - Sai do aplicativo");
        System.out.print("\nDigite uma op��o: ");

        // Cria uma entrada de teclado para obter op��o do menu
        Scanner myOption = new Scanner(System.in);

        // Recebe um n�mero inteiro pelo teclado
        int option = myOption.nextInt();

        // Conforme a op��o digitada
        switch (option) {

            // Encera aplicativo
            case -1:
                StopApp();
                break;

            // Cadastra novo usu�rio
            case 0:
                NewUser();
                break;

            // Lista dados do usu�rio
            default:
                ViewUser(option);
                break;
        }
    }

    public static void userMenu(int userId) throws SQLException {

        // Formata menu do usu�rio
        System.out.println("\n" + SEPARATOR + "\nMenu do usu�rio:\n");
        System.out.println("    0 - Volta para lista de usu�rios");
        System.out.println("    1 - Edita os dados do usu�rio");
        System.out.println("    99 - Apaga usu�rio do sistema");
        System.out.println("    -1 - Sai do aplicativo");
        System.out.print("\nDigite uma op��o: ");

        // Cria uma entrada de teclado para obter op��o do menu
        Scanner myOption = new Scanner(System.in);

        // Recebe um n�mero inteiro pelo teclado
        int option = myOption.nextInt();

        // Conforme a op��o digitada
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
