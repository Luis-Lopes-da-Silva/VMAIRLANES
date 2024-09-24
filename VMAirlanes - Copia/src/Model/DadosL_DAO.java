
package Model;

import static View.Login_GUI.cbe;
import static View.Login_GUI.usuario;
import javax.swing.JOptionPane;

public class DadosL_DAO {
    
    
    public static void Entrarr(){
            JOptionPane.showMessageDialog(null, "Email e senha corretos, abrindo agenda...");
            new View.FinalizarC_GUI().setVisible(true);  
    }
    
    
}