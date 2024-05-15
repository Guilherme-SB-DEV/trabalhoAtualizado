package sql;
import java.sql.*;
public class Conexao {
    
    static Connection conexao;
    PreparedStatement prepared;
    ResultSet rs;
    CallableStatement call;
    //conexao no banco de dados
    public static Connection open() throws Exception{
        String usuario = "root";
        String senha = "Gui0205#";
        String url = "jdbc:mysql://localhost:3306/banco"; //fazer alteração para o banco específico do projeto
        String dri = "com.mysql.jdbc.Driver";
        try{
            Class.forName(dri);
            conexao = DriverManager.getConnection(url, usuario, senha);
        }catch(Exception ex){
            ex.printStackTrace(); 
        }
       
        return conexao;
    }
    public void close() throws Exception{
        conexao.close();
    }
    

}
