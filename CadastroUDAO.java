/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import Interfaces.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemaprincipal.Usuario;

/**
 *
 * @author master
 */
public class CadastroUDAO {
   
    public void cadastrarUsuario(Usuario usuario){
        String sql =   "INSERT INTO usuario  (nome,email,usuario,senha) VALUES ('"
       + usuario.getNome()     + "','"
       + usuario.getEmail()    + "','"
       + usuario.getUsuario()  + "','" 
       + usuario.getSenha()    + "')";
      
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
    
    public void ConsultaLogin(Usuario usuario){
        String sql = "SELECT * FROM usuario where Usuario='" + usuario.getUsuario() + "' and Senha='" + usuario.getSenha() +"'";
        System.out.println(sql);
        try{
            Connection c = ConexaoDB.obtemConexao();
               PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                  
                   JOptionPane.showMessageDialog(null, "Login Realizado");
                   new Principal().setVisible(true);	
             } else{JOptionPane.showMessageDialog(null,"Usuario ou senha incorretos");}
                
            ps.close();
            c.close(); 
    
        }catch (SQLException e){
        JOptionPane.showMessageDialog(null,e);
        e.printStackTrace();
        }
    }

}

