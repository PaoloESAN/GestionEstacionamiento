package entidades;

public class Cliente extends Persona {
    int idCliente;
    String nroLicencia;

    public Cliente(int idCliente, String nroLicencia, int nacionalidad, String identificacion, String nombresApellidos, int sexo, String telefono, String correo, String direccion, String distrito) {
        this.idCliente = idCliente;
        this.nroLicencia = nroLicencia;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.nombresApellidos = nombresApellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.distrito = distrito;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }
    
    
}
