package entidades;

public class Vehiculo {
    String tipo;
    String idMarcaModelo;
    String color;
    String nroPlaca;
    String lunasPolarizadas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdMarcaModelo() {
        return idMarcaModelo;
    }

    public void setIdMarcaModelo(String idMarcaModelo) {
        this.idMarcaModelo = idMarcaModelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public String getLunasPolarizadas() {
        return lunasPolarizadas;
    }

    public void setLunasPolarizadas(String lunasPolarizadas) {
        this.lunasPolarizadas = lunasPolarizadas;
    }
}
