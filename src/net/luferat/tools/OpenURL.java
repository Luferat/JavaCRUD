package net.luferat.tools;

import java.io.IOException;
import java.net.URISyntaxException;

public class OpenURL {

    public static void OpenURL(String appURL) {

        // Processa e abre uma URL
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI(appURL));
        } catch (URISyntaxException error) {
            String methodName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            System.out.println("Oooops! Erro em " + methodName + ":  " + error.getMessage());
        } catch (IOException error) {
            String methodName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            System.out.println("Oooops! Erro em " + methodName + ":  " + error.getMessage());
        }

    }
}
