package ejercicio3Observer;

public class Notificacion {

    private String tipo;
    private String contenido;

    public Notificacion(String tipo, String contenido) {
        this.tipo=tipo;
        this.contenido=contenido;

    }

    public void info(){
        System.out.println("INFO > Tipo de archivo: ["+tipo+"]");
        System.out.println("INFO > contenido: " + contenido);
    }

    public String getCategoria() {
        return tipo;
    }

    public void setCategoria(String categoria) {
        this.tipo = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}