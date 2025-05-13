
package paneles;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Vehiculo;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Registros {

    public Registros() {
    }
    
    Cliente cliente;
    Empleado empleado;
    Vehiculo vehiculo;

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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void registroCliente(JFrame princ){
                JDialog mostrarClie = new JDialog(princ,"Registrar Cliente",true);
                mostrarClie.add(new RegistroCliente(mostrarClie,this));
                mostrarClie.pack();
                mostrarClie.setLocationRelativeTo(princ);
                mostrarClie.setVisible(true);
    }
    public void registroEmpleado(JFrame princ){
                JDialog mostrarEmple = new JDialog(princ,"Registrar Empleado",true);
                mostrarEmple.add(new RegistroEmpleado(mostrarEmple,this));
                mostrarEmple.pack();
                mostrarEmple.setLocationRelativeTo(princ);
                mostrarEmple.setVisible(true);
    }
    public void registroVehiculo(JFrame princ){
                JDialog mostrarVehi = new JDialog(princ,"Registrar Vehículo",true);
                mostrarVehi.add(new RegistroVehiculo(mostrarVehi,this));
                mostrarVehi.pack();
                mostrarVehi.setLocationRelativeTo(princ);
                mostrarVehi.setVisible(true);
    }
}
