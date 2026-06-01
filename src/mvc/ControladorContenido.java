package mvc;

import uni1a.ContenidoAudiovisual;

public class ControladorContenido {

    private VistaConsola vista;

    public ControladorContenido(VistaConsola vista) {
        this.vista = vista;
    }

    public void mostrarContenido(ContenidoAudiovisual contenido) {
        contenido.mostrarDetalles();
    }

    public void mostrarMensaje(String mensaje) {
        vista.mostrarMensaje(mensaje);
    }
}

