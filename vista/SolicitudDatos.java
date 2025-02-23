package vista;

import java.util.Scanner;

public class SolicitudDatos {

    private Scanner sc;

    public SolicitudDatos() {

    sc = new Scanner(System.in);
    }
    
    public String pedirNombre (){
        System.out.println("Ingrese su nombre");
        return sc.nextLine();
    }
    
    public String pedirTipoPago (){
        System.out.println("Que tipo de pago hara? de contado/ credito");
        return sc.nextLine();
    }
    
    public String elegirTela (){
        System.out.println("Que tipo de tela desea?  \n algodon 5000 \n licra 6000\n seda 4000");
        return sc.nextLine();
    }
    
    public int elegirCantidad (){
        System.out.println("Ingrese la cantidad de unidades de tela que desea");
        return sc.nextInt();
    }
    public void pedirTodosDatos (){
    pedirNombre();
    pedirTipoPago();
    elegirTela ();
    elegirCantidad ();
    }
}
