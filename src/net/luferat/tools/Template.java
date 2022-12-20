package net.luferat.tools;

public class Template {

    // Obtém configurações
    static Config c = new Config();

    public static void header() {

        String spaces = " ".repeat((c.SEPARATOR.length() - c.APPNAME.length()) / 2);

        System.out.println(c.SEPARATOR);
        System.out.println(spaces + c.APPNAME + spaces);
        System.out.println(c.SEPARATOR);

    }

}
