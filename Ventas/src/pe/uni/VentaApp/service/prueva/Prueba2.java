
package pe.uni.VentaApp.service.prueva;

import pe.uni.VentaApp.service.VentaService;

public class Prueba2 {
    
       public static void main(String[] args) {
        //Dato
        double precio = 100.0;
        int cantidad = 2;
        //Proceso
        VentaService service = new VentaService();
        double importe = service.calcularImporte(precio, cantidad);
        double impuesto = service.calcularImpuesto(precio, cantidad);
        double total = service.calcularTotal(precio, cantidad);
        //Reporte
        System.out.println("Importe : "+ importe);
        System.out.println("Impuesto Aplicado: "+ impuesto);
        System.out.println("Total a Pagar: "+ total);
        
              
    }
    
}
