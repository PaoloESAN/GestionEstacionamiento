package entidades;

public class Vehiculo {

    public Vehiculo() {
    }
    
    String tipo;
    String MarcaModelo;
    String color;
    String nroPlaca;
    String lunasPolarizadas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarcaModelo() {
        return MarcaModelo;
    }

    public void setMarcaModelo(String idMarcaModelo) {
        this.MarcaModelo = idMarcaModelo;
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
