package com.jcrud.jcrud;

import static com.jcrud.tools.ClearScreen.ClearScreen;
import static com.jcrud.tools.Config.*;
import static com.jcrud.tools.ShowMenu.mainMenu;
import java.io.IOException;

public class Jcrud {

    public static void main(String[] args) throws IOException, InterruptedException {
        ClearScreen();
        System.out.println(APPNAME);
        mainMenu();
    }

}
