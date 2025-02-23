package actividadclase;

import controlador.Controlador;
import modelo.Factura;
import vista.SolicitudDatos;
import vista.Visual;

public class ActividadClase {

    public static void main(String[] args) {

        SolicitudDatos solicitudDatos = new SolicitudDatos();

        Factura factura = new Factura(solicitudDatos.pedirNombre(), solicitudDatos.pedirTipoPago(), solicitudDatos.elegirTela(), solicitudDatos.elegirCantidad());
        Visual visual = new Visual();
        Controlador controlador = new Controlador(factura, visual);

        controlador.updateView();
        
        System.out.println(controlador.totalDescuento());
    }
}
