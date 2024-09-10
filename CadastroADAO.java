/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaprincipal.Agenda;

/**
 *
 * @author master
 */
public class CadastroADAO {
    public void cadastrarAgenda(Agenda agenda){
        String sql =   "INSERT INTO agenda (Paciente_Cpf, Medico_Crm, Data, Hora) VALUES ('"
       + agenda.getPaciente_Cpf() + "','"
       + agenda.getMedico_Crm()   + "','"
       + agenda.getData()         + "','"
       + agenda.getHora()         +"')";
      
       System.out.println(sql);
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");	
        ps.close();
        c.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na Transação");
        e.printStackTrace();
       }
    }
    
    //Alterar um usuario falta
    public void Alterar(Agenda agenda) {
        
       String sql =   "UPDATE  agenda SET  Medico_Crm=\""
       + agenda.getMedico_Crm() + "\",Data=\""
       + agenda.getData() + "\",Hora=\""
       + agenda.getHora() + "\" WHERE Paciente_Cpf=" + agenda.getPaciente_Cpf();
       System.out.println(sql);
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");	
        ps.close();
        c.close();               

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar");
        e.printStackTrace();
       }
    }
    //Excluir um usuario falta
    public void delete(Agenda  agenda) {
        
       
       String sql =   "DELETE FROM bdprojeto.agenda WHERE (Paciente_Cpf = '"+ agenda.getPaciente_Cpf() +"')";
       System.out.println(sql);
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        ps.close();
        c.close();

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Usuario não excluido");
             e.printStackTrace();
       }
    }
       
    // Consultar um Usuario falta
    public void consulta(Agenda agenda) {
        
       
        String sql = "SELECT * FROM agenda WHERE Paciente_Cpf=" + agenda.getPaciente_Cpf();             
        System.out.println(sql);
        try {  Connection c = ConexaoDB.obtemConexao();
               PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    
                   
                   
                   agenda.setPaciente_Cpf(rs.getString("Paciente_Cpf"));
                   agenda.setMedico_Crm(rs.getString("Medico_Crm"));
                   agenda.setData(rs.getString("Data"));
                   agenda.setHora(rs.getString("Hora"));
                }
                  
           }   
           catch (Exception e){
               JOptionPane.showMessageDialog(null,"Consulta invalida");
               e.printStackTrace();
           }
                   
         
     }
    
    
     public ArrayList listarAgendaConsulta(Agenda agenda){
        {
        ArrayList<Agenda> dados = new ArrayList();
        String sql = "SELECT * FROM agenda WHERE Paciente_Cpf=" + "'" + agenda.getPaciente_Cpf()+ "'";
        System.out.println(sql);
        try { Connection c = ConexaoDB.obtemConexao();
              PreparedStatement ps = c.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

            rs = ps.executeQuery();
            while (rs.next())
            {  Agenda a = new Agenda();
                
                a.setIdAgenda(rs.getInt("idAgenda"));
                a.setPaciente_Cpf(rs.getString("Paciente_Cpf"));
                a.setData(rs.getString("Data"));
                a.setHora(rs.getString("Hora"));
                a.setMedico_Crm(rs.getString("Medico_Crm"));
               
                
                dados.add(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dados;
       }
    
    
    
    
    
     
    }
     
}
