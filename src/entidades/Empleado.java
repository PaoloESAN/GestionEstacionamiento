package entidades;

public class Empleado extends Persona {
    int idEmpleado;
    String fechaNac;

    public Empleado(int idEmpleado, String fechaNac, int nacionalidad, String identificacion, String nombresApellidos, int sexo, String telefono, String correo, String direccion, String distrito) {
        this.idEmpleado = idEmpleado;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.nombresApellidos = nombresApellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.distrito = distrito;
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
