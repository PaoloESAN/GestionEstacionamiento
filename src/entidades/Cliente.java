package entidades;

public class Cliente extends Persona {
    String idCliente;
    String nroLicencia;

    public Cliente(String idCliente, String nroLicencia) {
        this.idCliente = idCliente;
        this.nroLicencia = nroLicencia;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

}
