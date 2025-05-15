package utilidades;

public class Validar {

    public static String validarDNI(String dni) {
        if (dni != null && dni.matches("\\d{8}")) {
            return "";
        }
        return "Error en el DNI";
    }

    public static String validarNombresYApellidos(String nombreCompleto) {
        if (nombreCompleto != null && nombreCompleto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]{3,50}$")) {
            return "";
        }
        return "Error en Nombres y Apellidos";
    }

    public static String validarLicencia(String licencia) {
        if (licencia != null && licencia.matches("[A-Z0-9]{6,12}")) {
            return "";
        }
        return "Error en el Nro. de Licencia";
    }

    public static String validarSexo(String sexo) {
        if (sexo != null && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
            return "";
        }
        return "Error en el Sexo";
    }

    public static String validarTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{9}")) {
            return "";
        }
        return "Error en el Teléfono";
    }

    public static String validarCorreo(String correo) {
        if (correo != null && correo.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
            return "";
        }
        return "Error en el Correo";
    }

    public static String validarDireccion(String direccion) {
        if (direccion != null && direccion.length() > 5 && direccion.length() < 25) {
            return "";
        }
        return "Error en la Dirección";
    }

    public static String validarDistrito(String distrito) {
        if (distrito != null && distrito.length() > 5 && distrito.length() < 25) {
            return "";
        }
        return "Error en el Distrito";
    }

    public static String validarPlaca(String placa) {
        if (placa != null && placa.matches("^[A-Z0-9]{6}$")) {
            return "";
        }
        return "Error en el Número de Placa";
    }
}

