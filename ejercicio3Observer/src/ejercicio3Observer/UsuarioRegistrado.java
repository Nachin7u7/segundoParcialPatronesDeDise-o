package ejercicio3Observer;

public class UsuarioRegistrado implements IUsuario{

    private String tipo;
    private Persona persona;

    public UsuarioRegistrado(Persona persona, String tipo) {
        this.persona=persona;
        this.tipo=tipo;
    }

    public UsuarioRegistrado() {
    }

    @Override
    public void update(String message, Notificacion notificacion) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        notificacion.info();
    }

    @Override
    public String getCategoria() {
        return this.tipo;
    }

}
