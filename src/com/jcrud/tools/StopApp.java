package com.jcrud.tools;

import static com.jcrud.tools.ClearScreen.ClearScreen;
import static com.jcrud.tools.Config.SEPARATOR;
import java.io.IOException;

public class StopApp {

    public static void StopApp() throws IOException, InterruptedException {
        
        // Limpa a tela
        ClearScreen();
        
        // Mensagem de encerramento
        System.out.println(SEPARATOR + "\nObrigado!\n\n\n\n");
        
        // Encerra o aplicativo
        System.exit(0);
        
    }    
}
