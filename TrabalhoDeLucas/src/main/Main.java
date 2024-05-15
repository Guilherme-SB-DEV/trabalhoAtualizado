package main;
import static sql.DAOS.DAO_Cuidador.consultaCuidador;
import java.util.Scanner;
import sql.DAOS.DAO_Paciente;
import static sql.DAOS.DAO_Paciente.consultaPaciente;
import static sql.DAOS.DAO_Paciente.deletePaciente;
import static sql.DAOS.DAO_Paciente.insertPaciente;
import users.Usr;
import users.UsrCuidador;
import users.UsrPaciente;
public class Main extends Usr{
    public static void main(String[] args){
        // TODO code application logic here
        int counter = 0;
        DAO_Paciente userpaciente = new DAO_Paciente();
        System.out.println(userpaciente.loginPaciente("65656", "senhapaciente"));
//        Scanner input = new Scanner(System.in);
//        System.out.println("cpf: ");
//        String cpfInput = input.next();
//        System.out.println("senha: ");
//        String senhaInput = input.next();
        //(tipoContrato, cpf, nomePerfil, especialidade, periodo, senha)
        //insertCuidador("clt","12312312312", "henrique", "especialidade", "tarde", "senhacuidador");
        //(nomePerfil, cpf, descrição, ddd, numero, senha)
//        insertPaciente("a","65656", "necessidade2", "72", "numero", 69,"senhapaciente");
//        deletePaciente(5);
//        deletePaciente(4);
//        deletePaciente(3);
        for(UsrPaciente usrPaciente: consultaPaciente()){
            System.out.println("nome: "+consultaPaciente().get(counter).getNome());
            System.out.println("necessidades: "+consultaPaciente().get(counter).getDescricaoNecessidades());
            System.out.println("idade: "+consultaPaciente().get(counter).getIdade());
            System.out.println("cpf: "+consultaPaciente().get(counter).getCpf());
            System.out.println("cidade: "+consultaPaciente().get(counter).getCidade());
            System.out.println("bairro: "+consultaPaciente().get(counter).getBairro());
            System.out.println("senha: "+consultaPaciente().get(counter).getSenhaPaciente());
            counter++;
        }
        //updateCuidador(1, "nome", "nome_teste");
//        deleteCuidador(1);
//        deleteCuidador(2);
//        deleteCuidador(3);
//        deleteCuidador(4);
//        for(UsrCuidador usrCuidador: consultaCuidador()){
//            System.out.println(consultaCuidador().get(counter).getNome());
//            System.out.println(consultaCuidador().get(counter).getDescricaoEspecialidade());
//           System.out.println(consultaCuidador().get(counter).getPeriodo());
//           System.out.println(consultaCuidador().get(counter).getTipoContrato());
//            System.out.println(consultaCuidador().get(counter).getCpf());
//            System.out.println(consultaCuidador().get(counter).getSenha());
//            counter++;
//        }
//        
//        System.out.println("resultado: "+ login(cpfInput, senhaInput));
//               
//                
//               
    }



}
