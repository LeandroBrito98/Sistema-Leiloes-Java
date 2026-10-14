
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        try {
            String usuario = System.getenv("UC11_DB_USER");
            String senha = System.getenv("UC11_DB_PASSWORD");

            if (usuario == null || senha == null) {
                throw new SQLException(
                    "Configure UC11_DB_USER e UC11_DB_PASSWORD."
                );
            }

            String url = "jdbc:mysql://localhost:3306/uc11";

            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(
                null,
                "Erro ao conectar ao banco uc11: "
                    + erro.getMessage()
            );
            return null;
        }
    }
}
