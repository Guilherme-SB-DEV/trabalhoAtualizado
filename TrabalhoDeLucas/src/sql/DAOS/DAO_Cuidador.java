package sql.DAOS;

import java.sql.*;
import static sql.Conexao.open;
import java.util.LinkedList;
import java.util.List;
import users.UsrCuidador;
public class DAO_Cuidador {
    private static String instrucao_select = "SELECT * FROM UsuarioCuidador;";
    private static String instrucao_insert = "INSERT INTO UsuarioCuidador(TipoContrato, Cpf, NomePerfil, DescricaoEspecialidades, periodo, senhaCuidador) VALUES (?,?,?,?,?,?);";
    private static String instrucao_delete = "DELETE FROM UsuarioCuidador WHERE IDCuidador = ?;";

        public static List<UsrCuidador> consultaCuidador(){
            try{
                List<UsrCuidador> arrayCuidador = new LinkedList<>(); //inicia arrayList de usuarios
                Connection con = open(); //abre conexão
                Statement sentenca = con.createStatement();
                ResultSet rs = sentenca.executeQuery(instrucao_select); //executa query
                while(rs.next()){
                    
                    UsrCuidador usr = new UsrCuidador(); //inicia isntancia de usuario
                    
                    //seta os dados da query como dados do objeto usuario
                    usr.setTipoContrato(rs.getString("TipoContrato"));
                    usr.setNome(rs.getString("NomePerfil"));
                    usr.setCpf(rs.getString("Cpf"));
                    usr.setDescricaoEspecialidade(rs.getString("DescricaoEspecialidades"));
                    usr.setPeriodo(rs.getString("periodo"));
                    usr.setSenhaCuidador(rs.getString("senhaCuidador"));
                    //add objeto no arrayList
                    arrayCuidador.add(usr);
                    
                }
                con.close();
                return arrayCuidador;
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
        }
        
        public static Boolean insertCuidador(String TipoContrato, String cpf, String NomePerfil, String DescricaoEspecialidades, String periodo, String senha){
            try{
                Connection con = open();
                PreparedStatement stm = con.prepareStatement(instrucao_insert);
                stm.setString(1, TipoContrato);
                stm.setString(2, cpf);
                stm.setString(3, NomePerfil);
                stm.setString(4, DescricaoEspecialidades);
                stm.setString(5, periodo);
                stm.setString(6, senha);
                stm.execute();
                con.close();
            return true;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                return false;
            }
        }
        public static Boolean updateCuidador(int id, String decisao, String valor){
            try {
                Connection con = open();
                PreparedStatement stm;
                switch (decisao) {
                    case "tipo":
                        stm = con.prepareStatement("UPDATE UsuarioCuidador SET TipoContrato=? WHERE IDCuidador = ?;");
                        break;
                    case "nome":
                        stm = con.prepareStatement("UPDATE UsuarioCuidador SET NomePerfil=? WHERE IDCuidador = ?;");
                        break;
                    case "descricao":
                        stm = con.prepareStatement("UPDATE UsuarioCuidador SET DescricaoEspecialidades=? WHERE IDCuidador = ?;");
                        break;
                    case "periodo":
                        stm = con.prepareStatement("UPDATE UsuarioCuidador SET periodo=? WHERE IDCuidador = ?;");
                        break;
                    case "cpf":
                        stm = con.prepareStatement("UPDATE UsuarioCuidador SET cpf=? WHERE IDCuidador = ?;");
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
        public static Boolean delete(int id){
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
        public boolean login (String cpf, String senha){
        int counterLogin=0;
        boolean result= false;
        for(UsrCuidador usrCuidador: consultaCuidador()){
            if(consultaCuidador().get(counterLogin).getCpf().equals(cpf) && consultaCuidador().get(counterLogin).getSenhaCuidador().equals(senha)){
                result = true;
                
            }else{
                result = false;
            }
            
            counterLogin++;
        }
        return result;
        
    }
}
