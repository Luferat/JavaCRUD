package net.luferat.tools;

// Importa classes necess�rias
import java.util.Scanner;
import static net.luferat.jcrud.About.About;
import static net.luferat.jcrud.DeleteUser.DeleteUser;
import static net.luferat.jcrud.EditUser.EditUser;
import static net.luferat.jcrud.NewUser.NewUser;
import static net.luferat.jcrud.UsersList.UsersList;
import static net.luferat.jcrud.ViewUser.ViewUser;
import static net.luferat.tools.OpenURL.OpenURL;
import static net.luferat.tools.StopApp.StopApp;

public class ShowMenu {

    // Obt�m configura��es
    static Config c = new Config();

    // Cria uma entrada de teclado para obter op��o do menu
    static Scanner myOption = new Scanner(System.in);

    public static void mainMenu() {

        // Formata menu principal
        System.out.println(
                "\n" + c.SEPARATOR + "\nMenu principal:\n\n"
                + "     0 -> Cadastra novo usu�rio\n"
                + "    Id -> Ver cadastro do usu�rio\n"
                + "    99 -> Sobre o aplicativo\n"
                + "    -1 -> Sai do aplicativo\n"
        );
        System.out.print("Digite uma op��o: ");

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

            // Sobre o aplicativo
            case 99:
                About();
                break;

            // Lista dados do usu�rio
            default:
                ViewUser(option);
                break;
        }
    }

    public static void userMenu(int userId) {

        // Formata menu do usu�rio
        System.out.println(
                "\n" + c.SEPARATOR + "\nMenu do usu�rio:\n\n"
                + "     0 -> Volta para lista de usu�rios\n"
                + "     1 -> Edita os dados do usu�rio\n"
                + "    99 -> Apaga usu�rio do sistema\n"
                + "    -1 -> Sai do aplicativo\n"
        );
        System.out.print("Digite uma op��o: ");

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

    public static void aboutMenu(String appURL) {

        System.out.println(
                "\n" + c.SEPARATOR + "\nMenu de sobre:\n\n"
                + "     0 -> In�cio\n"
                + "    99 -> Acessar site do aplicativo\n"
                + "    -1 -> Sair do aplicativo\n"
        );
        System.out.print("Digite uma op��o: ");

        // Recebe um n�mero inteiro pelo teclado
        int option = myOption.nextInt();

        switch (option) {
            case -1:
                StopApp();
                break;
            case 99:
                OpenURL(appURL);
                About();
                break;
            default:
                UsersList();
                break;
        }
    }
}
