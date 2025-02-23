
package modelo;

public class Producto {
    
    private double precio;
    private double cantidadProducto;
    private String nombreTela;

    public Producto( String nombreTela, double cantidadProducto) {
        
        this.nombreTela = nombreTela;
        this.cantidadProducto = cantidadProducto;
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(double cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    

    public String getNombreTela() {
        return nombreTela;
    }

    public void setNombreTela(String nombreTela) {
        this.nombreTela = nombreTela;
    }
    
    public double precioTela (){
    if (this.nombreTela.equalsIgnoreCase("algodon")){
    return 5000;
    }else if(this.nombreTela.equalsIgnoreCase("licra")){
    return 6000;
    }else if(this.nombreTela.equalsIgnoreCase("seda")){
    return 4000;
    }
    else return 0;
    }
    
        
    public double contarTotal(){
       double total = precioTela() * this.cantidadProducto;
       return total;
    }
    
}
