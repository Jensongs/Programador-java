
package pe.uni.Pedidoapp.prueba;

import pe.uni.Pedidoapp.service.PedidoService;

public class prueba01 {
    
 //Cuando una clase tiene le mètodo "main", se trata de una clase ejecutable.  
//digitar psvm y presionar la tecla "tabulador"
    public static void main(String[] args) {
        //Dato
        double importe = 1000.00;
        //Proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //Reporte
        System.out.println("Importe del Pedido: "+ importe);
        System.out.println("Impuesto Aplicado: "+ impuesto);
        System.out.println("Total a Pagar: "+ total);
    }
    
}
