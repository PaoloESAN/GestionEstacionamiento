
package paneles;

import entidades.Cliente;
import entidades.Empleado;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Registros {

    public Registros() {
    }
    
    Cliente cliente;
    Empleado empleado;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    public void registroCliente(JFrame princ){
                JDialog mostrarClie = new JDialog(princ,"Registrar Cliente",true);
                mostrarClie.add(new RegistroCliente(mostrarClie,this));
                mostrarClie.pack();
                mostrarClie.setLocationRelativeTo(princ);
                mostrarClie.setVisible(true);
    }
    public void registroEmpleado(JFrame princ){
                JDialog mostrarClie = new JDialog(princ,"Registrar Empleado",true);
                mostrarClie.add(new RegistroCliente(mostrarClie,this));
                mostrarClie.pack();
                mostrarClie.setLocationRelativeTo(princ);
                mostrarClie.setVisible(true);
    }
}
