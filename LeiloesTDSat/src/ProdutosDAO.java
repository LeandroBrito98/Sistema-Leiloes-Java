import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosDAO {
    public void cadastrarProduto(ProdutosDTO produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";
        try (Connection conn = new conectaDAO().connectDB()) {
            if (conn == null) throw new SQLException("Nao foi possivel conectar ao banco uc11.");
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, produto.getNome());
                stmt.setInt(2, produto.getValor());
                stmt.setString(3, produto.getStatus());
                stmt.executeUpdate();
            }
        }
    }

    public ArrayList<ProdutosDTO> listarProdutos() throws SQLException {
        return new ArrayList<>();
    }
}
