
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaDao {
    
    static Connection conectado;

    public static Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto", "root", "1910");
        return conectado;
    }

    public static void connectionInterno() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto", "root", "1910");
    }

    public static ResultSet login(String code, String p) throws ClassNotFoundException, SQLException {
        conectado = connection();
        PreparedStatement st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE codigo = ? AND senha = ?");
        st.setString(1, code);
        st.setString(2, p);
        ResultSet resultado = st.executeQuery();
        return resultado;
    }
    
    public static void salvarDepartamento(Funcionarios f) throws ClassNotFoundException, SQLException {
        conectado = connection();
        String sql = ("INSERT INTO funcionarios VALUES (?,?,?)");
        PreparedStatement st = conectado.prepareStatement(sql);
        st.setInt(1, f.getCodigo());
        st.setString(2, f.getNome());
        st.setString(3, f.getSenha());
        st.executeUpdate();
    }

    public static ResultSet consultarDepartamento(Funcionarios f) throws ClassNotFoundException, SQLException {
        conectado = connection();
        PreparedStatement st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE codigo = ? ");
        st.setInt(1, f.getCodigo());
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

    public static void excluirDepartamento(Funcionarios f) throws ClassNotFoundException, SQLException {
        conectado = connection();
        String sql = ("DELETE FROM funcionarios WHERE codigo = ? ");
        PreparedStatement st = conectado.prepareStatement(sql);
        st.setInt(1, f.getCodigo());
        st.executeUpdate();
    }

    public static void alterarDepartamento(Funcionarios f) throws ClassNotFoundException, SQLException {
        conectado = connection();
        PreparedStatement st = conectado.prepareStatement("UPDATE funcionarios SET nome = ?, senha = ? WHERE codigo = ?");
        st.setString(1, f.getNome());
        st.setString(2, f.getSenha());
        st.setInt(3, f.getCodigo());
        st.executeUpdate();
    }
}
