package net.luferat.jcrud;

// Importa classes necess�rias
import java.io.IOException;
import java.sql.SQLException;
import static net.luferat.jcrud.UsersList.UsersList;

public class Jcrud {

    // M�todo que executa o aplicativo
    public static void main(String[] args) throws SQLException, IOException {

        // Lista todos os usu�rios
        UsersList();
    }
}
