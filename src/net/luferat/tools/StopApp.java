package net.luferat.tools;

// Importa classes necess�rias
import static net.luferat.tools.ClearConsole.ClearConsole;

public class StopApp {
    
    // Obt�m configura��es
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
