package sql.DAOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import static sql.Conexao.open;
import users.UsrCuidador;
import users.UsrPaciente;

public class DAO_Paciente {
    private static String instrucao_select = "SELECT * FROM usuariopaciente;";
    private static String instrucao_insert = "INSERT INTO usuariopaciente( NomePerfil, Cpf, DescricaoNecessidades, ddd, numero, idadePaciente, senhaPaciente) VALUES (?,?,?,?,?,?,?);";
    private static String instrucao_delete = "DELETE FROM usuariopaciente WHERE IDPaciente = ?;";

    public static List<UsrPaciente> consultaPaciente() {
       List<UsrPaciente> arrayPaciente = new LinkedList<>();
       try {
           Connection con = open();
           if (con != null) {
               Statement sentenca = con.createStatement();
               ResultSet rs = sentenca.executeQuery(instrucao_select);
               while (rs.next()) {
                   UsrPaciente usr = new UsrPaciente();
                   usr.setNome(rs.getString("NomePerfil"));
                   usr.setCpf(rs.getString("Cpf"));
                   usr.setDescricaoNecessidades(rs.getString("DescricaoNecessidades"));
                   usr.setDdd(rs.getString("ddd"));
                   usr.setNumero(rs.getString("numero"));
                   usr.setIdade(rs.getInt("idadePaciente"));
                   usr.setSenhaPaciente(rs.getString("senhaPaciente"));
                   arrayPaciente.add(usr);
               }
               con.close();
           } else {
               System.out.println("Conexão com o banco de dados não foi estabelecida.");
           }
       } catch (Exception ex) {
           System.out.println("Erro ao consultar pacientes: " + ex.getMessage());
           ex.printStackTrace();
       }
       return arrayPaciente;
   }

    public static Boolean insertPaciente(String NomePerfil, String cpf, String DescricaoNecessidade, String ddd, String numero, int idadePaciente, String senhaPaciente){
        try{
            Connection con = open();
            PreparedStatement stm = con.prepareStatement(instrucao_insert);
            stm.setString(1, NomePerfil);
            stm.setString(2, cpf);
            stm.setString(3, DescricaoNecessidade);
            stm.setString(4, ddd);
            stm.setString(5, numero);
            stm.setInt(6, idadePaciente);
            stm.setString(7, senhaPaciente);
            stm.execute();
            con.close();
        return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static Boolean updatePaciente(int id, String decisao, String valor){
        try {
            Connection con = open();
            PreparedStatement stm;
            switch (decisao) {
                case "numero":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET numero=? WHERE IDPaciente = ?;");
                    break;
                case "nome":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET NomePerfil=? WHERE IDPaciente = ?;");
                    break;
                case "descricao":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET DescricaoNecessidade=? WHERE IDPaciente = ?;");
                    break;
                case "ddd":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET ddd=? WHERE IDPaciente = ?;");
                    break;
                case "cpf":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET cpf=? WHERE IDPaciente = ?;");
                    break;
                case "senha":
                    stm = con.prepareStatement("UPDATE UsuarioPaciente SET senhaPaciente=? WHERE IDPaciente = ?;");
                    break;
                default:
                    throw new AssertionError();
            }
            stm.setString(1, valor);
            stm.setInt(2, id);
            stm.execute();
            con.close();

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    public static Boolean deletePaciente(int id){
        try {
            Connection con = open();
            PreparedStatement stm = con.prepareStatement(instrucao_delete);
            stm.setInt(1, id);
            stm.execute();
            con.close();

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    
    
    public  boolean loginPaciente (String cpf, String senha){
    int counterLogin=0;
    boolean result= false;
    for(UsrPaciente usrPaciente: consultaPaciente()){
        if(consultaPaciente().get(counterLogin).getCpf().equals(cpf) && consultaPaciente().get(counterLogin).getSenhaPaciente().equals(senha)){
            result = true;

        }else{
            result = false;
        }

        counterLogin++;
    }
    return result;

    }


}
