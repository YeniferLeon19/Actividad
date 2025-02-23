
package vista;

public class Visual {
    public void detallesFactura (String nombre, String tipoCliente,String formaPago, double precioProducto,double descuento, double total){
        System.out.println("Senior/a: " + nombre);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Forma de pago: "+ formaPago);
        System.out.println("Precio individual del producto: " + precioProducto);
        System.out.println("Su descuento es:" + descuento + "%");
        System.out.println("El total de su compra es:" + total);
    }
}
