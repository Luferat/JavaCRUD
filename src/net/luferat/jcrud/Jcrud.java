package net.luferat.jcrud;

// Importa classes necessárias
import java.io.IOException;
import java.sql.SQLException;
import static net.luferat.jcrud.UsersList.UsersList;

public class Jcrud {

    // Método que executa o aplicativo
    public static void main(String[] args) throws SQLException, IOException {

        // Lista todos os usuários
        UsersList();
    }
}
