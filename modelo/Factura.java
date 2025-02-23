package modelo;

public class Factura extends Cliente {

    public Factura(String nombre,String tipoPago,String nombreTela, double cantidadProducto) {
        super(nombre, tipoPago, nombreTela, cantidadProducto);
    }


    public double descuentoMinoristas() {
        double descuento = 0.04 * contarTotal();
        double totalDescuento =  contarTotal() - descuento;
        return totalDescuento;
    }

    public double descuentoMayoristas() {
    double descuento = 0.07 * contarTotal();
        double totalDescuento =  contarTotal() - descuento;
        return totalDescuento;
    }

    public double comprasDeContadoMin() {
        double descuento = 0.14 * contarTotal();
        double totalDescuento =  contarTotal()- descuento;
        return totalDescuento;
    }
    
        public double comprasDeContadoMay() {
        double descuento = 0.17 * contarTotal();
        double totalDescuento =  contarTotal()- descuento;
        return totalDescuento;
    }
       
}
