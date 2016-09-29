package mx.com.rteck.mismapas.Pojo;

/**
 * Created by Gerardo Monreal J on 29/09/2016.
 */

public class Lugar {
    private int foto;
    private double longitud;
    private  double latitud;

    public Lugar(int foto, double longitud, double latitud) {
        this.foto = foto;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
