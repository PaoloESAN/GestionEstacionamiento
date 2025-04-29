package entidades;

public class Empleado extends Persona {
    int idEmpleado;
    String fechaNac;

    public Empleado(int idEmpleado, String fechaNac) {
        this.idEmpleado = idEmpleado;
        this.fechaNac = fechaNac;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
