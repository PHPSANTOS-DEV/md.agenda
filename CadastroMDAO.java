/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemaprincipal.Medico;


public class CadastroMDAO {
    public void cadastrarMedico(Medico medico){
        String sql =   "INSERT INTO medico (nome,cpf,telefone,endereco,email,crm) VALUES ('"
       + medico.getNome()      + "','"
       + medico.getCpf()       + "','"
       + medico.getTelefone()  + "','" 
       + medico.getEndereco()  + "','"
       + medico.getEmail()     + "','"
       + medico.getCrm()       + "')";
      
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
    

