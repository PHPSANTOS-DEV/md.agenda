
package sistemaprincipal;

import BancoDados.ConexaoDB;
import Interfaces.Login;
import Interfaces.Principal;


public class SistemaPrincipal {

   
    public static void main(String[] args) {
        ConexaoDB con = new ConexaoDB();
        con.obtemConexao();
        new Login().show();
        
        
    }
    
}
