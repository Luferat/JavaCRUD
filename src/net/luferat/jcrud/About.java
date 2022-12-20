package net.luferat.jcrud;

import static net.luferat.tools.ClearConsole.ClearConsole;
import net.luferat.tools.Config;
import static net.luferat.tools.ShowMenu.aboutMenu;
import static net.luferat.tools.Template.header;

/**
 *
 * @author andre.ataide
 */
public class About {

    // Obtém configurações
    static Config c = new Config();

    public static void About() {

        ClearConsole();
        header();

        System.out.println(
                "Sobre o " + c.APPNAME + ":\n\n"
                + c.APPDESCRIPTION + "\n\n"
                + "    Versão: " + c.APPVERSION + "\n"
                + "     Autor: " + c.APPAUTHOR + "\n"
                + "    E-mail: " + c.APPCONTACT + "\n"
                + "      Site: " + c.APPSITE
        );

        aboutMenu(c.APPSITE);
    }
}
