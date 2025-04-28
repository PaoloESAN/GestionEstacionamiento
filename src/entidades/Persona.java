package entidades;

public abstract class Persona {
    int nacionalidad;
    String identificacion;
    String nombresApellidos;
    int sexo;
    String telefono;
    String correo;
    String direccion;
    String distrito;

    public String getNacionalidad() {
        switch (nacionalidad) {
            case 1:
                return "Peruana";
            case 2:
                return "Extranjera";
        }
        return "No especificado";
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getSexo() {
        switch (sexo) {
            case 1:
                return "Hombre";
            case 2:
                return "Mujer";
        }
        return "Otro";
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
}
