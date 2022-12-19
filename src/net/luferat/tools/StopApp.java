package net.luferat.tools;

// Importa classes necess�rias
import static net.luferat.tools.ClearConsole.ClearConsole;
import static net.luferat.tools.Config.SEPARATOR;

public class StopApp {

    public static void StopApp() {

        // Limpa o console
        ClearConsole();

        // Mensagem de encerramento
        System.out.println(SEPARATOR + "\nObrigado!\n\n\n\n");

        // Encerra aplicativo
        System.exit(0);
    }

}
