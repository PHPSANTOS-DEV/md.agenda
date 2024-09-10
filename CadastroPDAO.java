/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaprincipal.Paciente;

/**
 *
 * @author master
 */
public class CadastroPDAO {  
    public void cadastrarPaciente(Paciente paciente){
        String sql =   "INSERT INTO paciente (nome,cpf,telefone,endereco,email,numsus,numconvenio) VALUES ('"
       + paciente.getNome() + "','"
       + paciente.getCpf() + "','"
       + paciente.getTelefone() + "','" 
       + paciente.getEndereco()+ "','"
       + paciente.getEmail() + "','"
       + paciente.getNumSus() + "','"
       + paciente.getNumConvenio() + "')";
      
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
    
}
    

