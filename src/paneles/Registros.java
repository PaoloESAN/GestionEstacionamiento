
package paneles;

import entidades.Cliente;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Registros {

    public Registros() {
    }
    
    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void registroCliente(JFrame princ){
                JDialog mostrarClie = new JDialog(princ,"Registrar Cliente",true);
                mostrarClie.add(new RegistroCliente(mostrarClie,this));
                mostrarClie.pack();
                mostrarClie.setLocationRelativeTo(princ);
                mostrarClie.setVisible(true);
    }
}
