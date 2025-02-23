
package modelo;


public class Cliente extends Producto {
    
    private String nombre;
    private String tipoCliente;
    private String tipoPago;

    public Cliente(String nombre, String tipoPago, String nombreTela, double cantidadProducto) {
        super(nombreTela, cantidadProducto);
        this.nombre = nombre;
        this.tipoPago = tipoPago;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String asignacionTipoCliente(){
    if(getCantidadProducto()>=12){
    return "mayorista";
    }
    else return "minorista";
    } 
  
}
