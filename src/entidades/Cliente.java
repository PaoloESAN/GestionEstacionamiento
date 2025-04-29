package entidades;

public class Cliente extends Persona {
    int idCliente;
    String nroLicencia;

    public Cliente(int idCliente, String nroLicencia) {
        this.idCliente = idCliente;
        this.nroLicencia = nroLicencia;
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
