package net.luferat.tools;

// Importa classes necessárias
import static net.luferat.tools.ClearConsole.ClearConsole;

public class StopApp {
    
    // Obtém configurações
    static Config c = new Config();

    public static void StopApp() {

        // Limpa o console
        ClearConsole();

        // Mensagem de encerramento
        System.out.println(c.SEPARATOR + "\nObrigado!\n\n\n\n");

        // Encerra aplicativo
        System.exit(0);
    }

}
