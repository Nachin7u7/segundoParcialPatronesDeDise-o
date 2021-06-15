package ejercicio3Observer;

import java.util.*;

public class NotificacionFacebook implements INotificacion {

    private List<IUsuario> observerList= new ArrayList<>();

    private List<Notificacion> notificacionList = new ArrayList<>();

    public void uploadNewNotificacion(Notificacion notificacion){
        notificacionList.add(notificacion);
        this.notifyObserver(notificacion);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Notificacion notificacion) {
        for (IUsuario userTelefonia:observerList) {
            if (userTelefonia.getCategoria().equals(notificacion.getCategoria())){
                // notificacion
                userTelefonia.update("La nueva notificacion dice: " + notificacion.getContenido(),notificacion);
            }

        }
    }
}
