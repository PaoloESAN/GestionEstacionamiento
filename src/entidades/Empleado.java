package entidades;

public class Empleado extends Persona {
    String idEmpleado;
    String fechaNac;

    public Empleado(String idEmpleado, String fechaNac) {
        this.idEmpleado = idEmpleado;
        this.fechaNac = fechaNac;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
