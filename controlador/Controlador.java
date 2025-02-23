package controlador;

import modelo.Factura;

import vista.Visual;

public class Controlador {

    private Factura factura;
    private Visual vista;

    public Controlador(Factura factura, Visual vista) {
        this.factura = factura;
        this.vista = vista;

    }
    public String asignacionTipoCliente(){
    return factura.asignacionTipoCliente();
    }
    
    public String getnombreCliente() {
        return factura.getNombre();
    }

    public double getcantidadProductos() {
        return factura.getCantidadProducto();
    }

    public double precioProducto(){
    return factura.precioTela();
    }
    
    
    public double totalDescuento() {
        if (factura.asignacionTipoCliente().equalsIgnoreCase("mayorista") && factura.getTipoPago().equalsIgnoreCase("de contado")) {
            return factura.comprasDeContadoMay();
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("minorista") && factura.getTipoPago().equalsIgnoreCase("de contado")) {
            return factura.comprasDeContadoMin();
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("mayorista") && factura.getTipoPago().equalsIgnoreCase("credito")) {
            return factura.descuentoMayoristas();
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("minorista") && factura.getTipoPago().equalsIgnoreCase("credito")) {
            return factura.descuentoMinoristas();
        } else {
            return 0;
        }
    }
    
        public double asignacionDescuento() {
        if (factura.asignacionTipoCliente().equalsIgnoreCase("mayorista") && factura.getTipoPago().equalsIgnoreCase("de contado")) {
            return 17;
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("minorista") && factura.getTipoPago().equalsIgnoreCase("de contado")) {
            return 14;
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("mayorista") && factura.getTipoPago().equalsIgnoreCase("credito")) {
            return 7;
            
        } else if (factura.asignacionTipoCliente().equalsIgnoreCase("minorista") && factura.getTipoPago().equalsIgnoreCase("credito")) {
            return 4;
        } else {
            return 0;
        }
    }
        
        public void updateView(){
        
        vista.detallesFactura(factura.getNombre(), factura.asignacionTipoCliente(), factura.getTipoPago(),factura.precioTela() ,asignacionDescuento(), totalDescuento());
        }
}
